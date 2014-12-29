import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.stringtemplate.v4.*;


public class CompilerVisitor extends AcodeBaseVisitor<CodeFragment> {
       
	private ArrayList< HashMap<String, String> > mem= new ArrayList< HashMap<String, String> >();
	private ArrayList<Function> functions = new ArrayList<Function>();
    private ArrayList<Function> extern_functions = new ArrayList<Function>();
    private int labelIndex = 0;
    private int registerIndex = 0;
	private int funcIndex = 0;
    private CodeFragment extern_def = new CodeFragment();

    private String generateNewLabel() {
        return String.format("L%d", this.labelIndex++);
    }

    private String generateNewRegister() {
        return String.format("%%R%d", this.registerIndex++);
    }

    @Override
    public CodeFragment visitAssign(AcodeParser.AssignContext ctx) {
        CodeFragment value = visit(ctx.expression());
        String mem_register="";
        String code_stub = "";

        String identifier = ctx.lvalue().getText();
        int i=mem.size()-1;
        while ((i>=0) && !mem.get(i).containsKey(identifier)) i--;
        if (i>=0) {
            mem_register = mem.get(i).get(identifier);
        }else{
            System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
        }

        ST template = new ST(
            "<value_code>" + 
            code_stub + 
            "store i32 <value_register>, i32* <mem_register>\n"
            );
        template.add("value_code", value);
        template.add("value_register", value.getRegister());
        template.add("mem_register", mem_register);
        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(value.getRegister());
        return ret;
    }

    @Override
    public CodeFragment visitAssVar(AcodeParser.AssVarContext ctx) {
        CodeFragment code = visit(ctx.assign_var());
        return code;
    }

    @Override
    public CodeFragment visitAssign_var(AcodeParser.Assign_varContext ctx) {
        CodeFragment value = visit(ctx.expression());
        String mem_register;
        String code_stub = "";

        String identifier = ctx.lvalue().getText();

        if (!mem.get(mem.size()-1).containsKey(identifier)) {
            mem_register = this.generateNewRegister();
            code_stub = "<mem_register> = alloca i32\n";
            mem.get(mem.size()-1).put(identifier, mem_register);
        } else {
            mem_register = mem.get(mem.size()-1).get(identifier);

        }
        ST template = new ST(
            "<value_code>" + 
            code_stub + 
            "store i32 <value_register>, i32* <mem_register>\n"
            );
        template.add("value_code", value);
        template.add("value_register", value.getRegister());
        template.add("mem_register", mem_register);
        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(value.getRegister());
        return ret;
    }



    @Override
    public CodeFragment visitArgs(AcodeParser.ArgsContext ctx) {
        CodeFragment ret = new CodeFragment();		
        for(int i =0;i<ctx.lvalue().size();i++){
            String mem_register=generateNewRegister();
            String new_register=generateNewRegister();			
            mem.get(mem.size()-1).put(ctx.lvalue(i).getText(), new_register);
            ST template = new ST(
            "<new_register> = alloca i32\n"+
            "store i32 <mem_register>, i32* <new_register>\n"
            );
            ret.addArg(mem_register);
            template.add("mem_register", mem_register);
            template.add("new_register", new_register);
            ret.addCode(template.render());
            ret.setRegister(new_register);
        }
        return ret;
    }


   @Override
        public CodeFragment visitExtern(AcodeParser.ExternContext ctx) {
            String type = ctx.type().getText();     
            String name = ctx.name().getText(); 
            CodeFragment args = visit(ctx.args());
          
            Function f = new Function(type,name,args.args_list(),null);
            extern_functions.add(f);  

        ST template = new ST(       
        "declare <type> @<name>(<args>)\n"
        );
        
        template.add("type", type_code(type));
        template.add("name", name);
        template.add("args",args.extern_args_code());
        String register=generateNewRegister();
        template.add("register", register);

        extern_def.addCode(template.render());
      //  extern_def.setRegister(register);
        CodeFragment ret = new CodeFragment();
        return ret;
    }

    public String type_code(String type){
        String t = "";
         switch (type) {
            case "int":
                t="i32";
                break;
            case "void":
                t = "void";
                break;
            case "bool":
                t = "i1";
                break;    
        }

        return t;
    }

    @Override
    public CodeFragment visitFunctionDef(AcodeParser.FunctionDefContext ctx) {
        String name = ctx.name().getText();	
        String type = ctx.type().getText(); 
        CodeFragment args = visit(ctx.args());
        CodeFragment body = visit(ctx.block());

        CodeFragment ret = new CodeFragment();
        ret.appendCodeFragment(args);
        ret.appendCodeFragment(body);

        Function f = new Function(type,name,args.args_list(),ret);
        functions.add(f);	

              // ret.setRegister(body.getRegister());
        CodeFragment code = new CodeFragment();
        return code;
    }

	@Override
        public CodeFragment visitParam_call(AcodeParser.Param_callContext ctx) {
		CodeFragment code = new CodeFragment();	
	
		for(AcodeParser.ExpressionContext p: ctx.expression()){
			CodeFragment e = visit(p);
			code.addCode(e);
			code.addArg(e.getRegister());
		}
        return code;
	}
	
	@Override 
	public CodeFragment visitFuncCall(AcodeParser.FuncCallContext ctx) {
		String name = ctx.name().getText();	
		CodeFragment param = visit(ctx.param_call());
		Function f=null;
        for(int i =0;i<extern_functions.size();i++){
            if(name.equals(extern_functions.get(i).name)){
                f=extern_functions.get(i); 
            }
        }

		for(int i =0;i<functions.size();i++){
			if(name.equals(functions.get(i).name)){
				f=functions.get(i);	
			}
		}
					
		//System.err.println("Fun"+f.name);
		CodeFragment code = new CodeFragment();
        String register=generateNewRegister();
        //System.err.println("type: "+f.type());
        ST template =null;
        if(f.type().equals("void")){
            template = new ST(       
            "<params_code>"+    
            "call void @<name>(<args>)\n"
            );
            template.add("params_code", param);
            template.add("name", f.name);
            template.add("args",param.args_code());
       
        }
        else
        {
		    template = new ST(		
		    "<params_code>"+	
		    "<register> = call <type> @<name>(<args>)\n"
		    );
            
            template.add("params_code", param);
            template.add("name", f.name);
            template.add("type",f.type());
            template.add("args",param.args_code());
            template.add("register", register);

        }

		
        
		code.addCode(template.render());
		code.setRegister(register);
		return code;
	}
/*
        @Override
        public CodeFragment visitPrint(AcodeParser.PrintContext ctx) {
                CodeFragment code = visit(ctx.expression());
                ST template = new ST(
                        "<value_code>" + 
                       "call i32 @printInt (i32 <value>)\n"
                );
                template.add("value_code", code);
                template.add("value", code.getRegister());
		//System.err.println(code.getRegister());
                
                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                return ret;
        }*/

        public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
           // System.err.println("Lv:"+left+" Rv:"+right);
                String code_stub = "<ret> = <instruction> i32 <left_val>, <right_val>\n";
                String instruction = "or";
                switch (operator) {
                        case AcodeParser.EQ:
                                instruction = "eq";
                                code_stub = "<ret> = icmp <instruction> i32 <left_val>, <right_val>\n";
                                break;
                        case AcodeParser.NE:
                                instruction = "ne";
                                code_stub = "<ret> = icmp <instruction> i32 <left_val>, <right_val>\n";
                                break;
                                
                        case AcodeParser.LE:
                                instruction = "sle";
                                code_stub = "<ret> = icmp <instruction> i32 <left_val>, <right_val>\n";
                                break;
                                
                        case AcodeParser.LT:
                                instruction = "slt";
                                code_stub = "<ret> = icmp <instruction> i32 <left_val>, <right_val>\n";
                                break;
                        case AcodeParser.GE:
                                instruction = "sge";
                                code_stub = "<ret> = icmp <instruction> i32 <left_val>, <right_val>\n";
                                break;
                                
                        case AcodeParser.GT:
                                instruction = "sgt";
                                code_stub = "<ret> = icmp <instruction> i32 <left_val>, <right_val>\n";
                                break;        
                                                        
                        case AcodeParser.ADD:
                                instruction = "add";
                                break;
                        case AcodeParser.ADD_A:
                                instruction = "add";
                                break;        

                        case AcodeParser.SUB:
                                instruction = "sub";
                                break;
                        case AcodeParser.SUB_A:
                                instruction = "sub";
                                break;        
                        case AcodeParser.MUL:
                                instruction = "mul";
                                break;
                        case AcodeParser.MUL_A:
                                instruction = "mul";
                                break;        
                        case AcodeParser.DIV:
                                instruction = "sdiv";
                                break;
                        case AcodeParser.DIV_A:
                                instruction = "sdiv";
                                break;    
                        case AcodeParser.MOD:
                                instruction = "srem";
                                break;
                        case AcodeParser.MOD_A:
                                instruction = "srem";
                                break;               
                        case AcodeParser.EXP:
                                instruction = "@iexp";
                                code_stub = "<ret> = call i32 <instruction>(i32 <left_val>, i32 <right_val>)\n";
                                break;
                        case AcodeParser.EXP_A:
                                instruction = "@iexp";
                                code_stub = "<ret> = call i32 <instruction>(i32 <left_val>, i32 <right_val>)\n";
                                break;        
                        case AcodeParser.AND:
                                instruction = "and";
                        case AcodeParser.OR:
                                ST temp = new ST(
                                        "<r1> = icmp ne i32 \\<left_val>, 0\n" +
                                        "<r2> = icmp ne i32 \\<right_val>, 0\n" +
                                        "<r3> = \\<instruction> i1 <r1>, <r2>\n" +
                                        "\\<ret> = zext i1 <r3> to i32\n"
                                );
                                temp.add("r1", this.generateNewRegister());
                                temp.add("r2", this.generateNewRegister());
                                temp.add("r3", this.generateNewRegister());
                                code_stub = temp.render();
                                break;
                }
                ST template = new ST(
                        "<left_code>" + 
                        "<right_code>" + 
                        code_stub
                );
                template.add("left_code", left);
                template.add("right_code", right);
                template.add("instruction", instruction);
                template.add("left_val", left.getRegister());
                template.add("right_val", right.getRegister());
                String ret_register = this.generateNewRegister();
                template.add("ret", ret_register);
                
                CodeFragment ret = new CodeFragment();
                ret.setRegister(ret_register);
                ret.addCode(template.render());
                return ret;
        
        }
        
        public CodeFragment generateUnaryOperatorCodeFragment(CodeFragment code, Integer operator) {
                if (operator == AcodeParser.ADD) {
                        return code;
                }

                String code_stub = "";
                switch(operator) {
                        case AcodeParser.SUB:
                                code_stub = "<ret> = sub i32 0, <input>\n";
                                break;
                        case AcodeParser.NOT:
                                ST temp = new ST(
                                        "<r> = icmp eq i32 \\<input>, 0\n" + 
                                        "\\<ret> = zext i1 <r> to i32\n"
                                );
                                temp.add("r", this.generateNewRegister());
                                code_stub = temp.render();
                                break;
                }
                ST template = new ST("<code>" + code_stub);
                String ret_register = this.generateNewRegister();
                template.add("code", code);
                template.add("ret", ret_register);
                template.add("input", code.getRegister());

                CodeFragment ret = new CodeFragment();        
                ret.setRegister(ret_register);
                ret.addCode(template.render());
                return ret;
                
        }
        @Override
        public CodeFragment visitOwn_ass(AcodeParser.Own_assContext ctx) {
               CodeFragment code = visit(ctx.own_assign());
                return code;
        }

         @Override
        public CodeFragment visitOwn_assign(AcodeParser.Own_assignContext ctx) {
            CodeFragment value = new CodeFragment();
            String mem_register="";
         //  System.err.println("ERR: "+ctx.lvalue().getText()+ctx.expression().getText()+ ctx.op.getType());
           CodeFragment exp= new CodeFragment();
           exp=visit(ctx.expression(0));
           String identifier=ctx.expression(0).getText();
           System.err.println("VAr"+ctx.expression(0).getText());
             value=generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
 System.err.println("ERR: "+value+"ERR");

    int i=mem.size()-1;
        while ((i>=0) && !mem.get(i).containsKey(identifier)) i--;
                if (i>=0) {
                        mem_register = mem.get(i).get(identifier);
                }else{
            System.err.println(String.format("Error: idenifier '%s' does not exists", identifier));
        }

               ST template = new ST(
                        "<value_code>" + 
                        "store i32 <value_register>, i32* <mem_register>\n"
                );
                template.add("value_code", value);
                template.add("value_register", value.getRegister());
                 
                template.add("mem_register",mem_register);
                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(value.getRegister());
                System.err.println("RET"+ret);
                return ret;

          
        }

      

        @Override
        public CodeFragment visitCmp(AcodeParser.CmpContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitAdd(AcodeParser.AddContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
			visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override 
        public CodeFragment visitMul(AcodeParser.MulContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override 
        public CodeFragment visitExp(AcodeParser.ExpContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitPar(AcodeParser.ParContext ctx) {
                return visit(ctx.expression());
        }


        @Override
        public CodeFragment visitUna(AcodeParser.UnaContext ctx) {
                return generateUnaryOperatorCodeFragment(
                        visit(ctx.expression()),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitVar(AcodeParser.VarContext ctx) {
                String id = ctx.STRING().getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                String pointer = "!\"Unknown identifier\"";
         		
		int i=mem.size()-1;
		while ((i>=0) && !mem.get(i).containsKey(id)) i--;
                if (i>=0) {
                        pointer = mem.get(i).get(id);
                }
                code.addCode(String.format("%s = load i32* %s\n", register, pointer));
                code.setRegister(register);
                return code;
        }

        @Override
        public CodeFragment visitInt(AcodeParser.IntContext ctx) {
                String value = ctx.INT().getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                code.setRegister(register);
                code.addCode(String.format("%s = add i32 0, %s\n", register, value));
                return code;
        }

	@Override
        public CodeFragment visitRet(AcodeParser.RetContext ctx) {
		CodeFragment code = visit(ctx.expression());           
                code.addCode(String.format("ret i32 %s\n",code.getRegister()));
                return code;
        }

        @Override 
        public CodeFragment visitBlock(AcodeParser.BlockContext ctx) {
                mem.add(new HashMap<String,String>());
                CodeFragment cf=visit(ctx.statements());
                mem.remove(mem.size()-1);
                return cf;
        }

	@Override
        public CodeFragment visitBlock_st(AcodeParser.Block_stContext ctx) {
                CodeFragment code = visit(ctx.block());
		return code;
        }

        @Override 
        public CodeFragment visitIf(AcodeParser.IfContext ctx) {
                CodeFragment condition = generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
                CodeFragment statement_true = visit(ctx.block(0));
                CodeFragment statement_false = visit(ctx.block(1));

                ST template = new ST(
                        "<condition_code>" + 
                        "<cmp_reg> = icmp ne i1 <con_reg>, 0\n" + 
                        "br i1 <cmp_reg>, label %<block_true>, label %<block_false>\n" +
                        "<block_true>:\n" +
                        "<statement_true_code>" +
                        "br label %<block_end>\n" + 
                        "<block_false>:\n" + 
                        "<statement_false_code>" +
                        "br label %<block_end>\n" + 
                        "<block_end>:\n" +
                        "<ret> = add i32 0, 0\n"
                );
                template.add("condition_code", condition);
                template.add("statement_true_code", statement_true);
                template.add("statement_false_code", statement_false);
                template.add("cmp_reg", this.generateNewRegister());
                template.add("con_reg", condition.getRegister());
                template.add("block_true", this.generateNewLabel());
                template.add("block_false", this.generateNewLabel());
                template.add("block_end", this.generateNewLabel());
                String return_register = generateNewRegister();
                template.add("ret", return_register);
                
                CodeFragment ret = new CodeFragment();
                ret.setRegister(return_register);
                ret.addCode(template.render());

                return ret;
        }

        @Override
        public CodeFragment visitWhile(AcodeParser.WhileContext ctx) {
                CodeFragment condition = visit(ctx.expression());
                CodeFragment body = visit(ctx.block());
                
                ST template = new ST(
                        "br label %<cmp_label>\n" + 
                        "<cmp_label>:\n" + 
                        "<condition_code>" +
                        "<cmp_register> = icmp ne i32 <condition_register>, 0\n" + 
                        "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" + 
                        "<body_label>:\n" + 
                        "<body_code>" + 
                        "br label %<cmp_label>\n" + 
                        "<end_label>:\n" + 
                        "<ret> = add i32 0, 0\n"
                );
                template.add("cmp_label", generateNewLabel());
                template.add("condition_code", condition);
                template.add("cmp_register", generateNewRegister());
                template.add("condition_register", condition.getRegister());
                template.add("body_label", generateNewLabel());
                template.add("end_label", generateNewLabel());
                template.add("body_code", body);
                String end_register = generateNewRegister();
                template.add("ret", end_register);
                
                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(end_register);
                return ret;
        }

      /*  public String type_str(Integer i){
            String s="";
            switch (i) {
                        case AcodeParser.EQ:
                                s = "eq";
                                break;
                        case AcodeParser.NE:
                                s = "ne";
                                break;                              
                        case AcodeParser.LE:
                                s = "le";
                                break;
                                
                        case AcodeParser.LT:
                                s = "ult";
                                break;
                        case AcodeParser.GE:
                                s = "ge";                               
                                break;                              
                        case AcodeParser.GT:
                                s = "gt";
                                break;  
            } 
            return s;
    }
*/
      @Override
        public CodeFragment visitFor(AcodeParser.ForContext ctx) { 
            CodeFragment ass_var=visit(ctx.assign_var());
           // CodeFragment var =visit(ctx.expression(0));
           // CodeFragment value =visit(ctx.expression(1));    
            CodeFragment cmp=generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
            System.err.println("OP"+ctx.op);
            CodeFragment own_assign =visit(ctx.own_assign());
            CodeFragment body =visit(ctx.block());
            ST template = new ST(
                        "<assign_var>"+
                        "br label %<cmp_label>\n" + 
                        "<cmp_label>:\n" + 
                        "<cmp>" +
                        //"<cmp_register> = icmp <op> i32 <var_register>, <value_register>\n" + 
                        "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" + 
                        "<body_label>:\n" + 
                        "<body_code>" + 
                        "<own_assign_code>"+
                        "br label %<cmp_label>\n" + 
                        "<end_label>:\n" + 
                        "<ret> = add i32 0, 0\n"
                );
            template.add("assign_var", ass_var);
             template.add("cmp_label", generateNewLabel());
                template.add("cmp", cmp);
               // template.add("op", type_str(ctx.op.getType()));
                template.add("cmp_register", cmp.getRegister());
            //    template.add("condition_register", cmp.getRegister());
              //  template.add("var_register", ass_var.getRegister());
              //  template.add("value_register", value.getRegister());
                template.add("body_label", generateNewLabel());
                template.add("end_label", generateNewLabel());
                template.add("body_code", body);
                template.add("own_assign_code", own_assign);
                String end_register = generateNewRegister();
                template.add("ret", end_register);



               CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                ret.setRegister(end_register);
                System.err.println("FOR:"+ret+"FOR");
                return ret;
        }
        

        @Override 
        public CodeFragment visitNot(AcodeParser.NotContext ctx) {
                return generateUnaryOperatorCodeFragment(
                        visit(ctx.expression()),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitAnd(AcodeParser.AndContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitOr(AcodeParser.OrContext ctx) {
                return generateBinaryOperatorCodeFragment(
                        visit(ctx.expression(0)),
                        visit(ctx.expression(1)),
                        ctx.op.getType()
                );
        }

        @Override
        public CodeFragment visitInit(AcodeParser.InitContext ctx) {
		mem.add(new HashMap<String, String>());
                CodeFragment body = visit(ctx.statements());
		
                ST template = new ST(
                        "declare i32 @printInt(i32)\n" + 
                        "declare i32 @iexp(i32, i32)\n" + 
                        "<extern_def>"+    
			            "<functions>" +
                        "define i32 @main() {\n" + 
                        "start:\n" + 
                        "<body_code>" + 
                        "ret i32 0\n" +
                        "}\n"
                );
		template.add("functions", allFunctions());
                template.add("body_code", body);
                template.add("extern_def", extern_def);

                CodeFragment code = new CodeFragment();
                code.addCode(template.render());
                code.setRegister(body.getRegister());
                return code;
        }


	public CodeFragment allFunctions(){
		CodeFragment code = new CodeFragment();
		for(Function f: functions){
			ST template = new ST(
				"define i32 @<name>(<args>) {\n"	+
				"start:\n" + 
                      		"<body_code>" + 
                        	"}\n"
               		);
                
			template.add("name", f.name);
              		template.add("args", f.args());
                	template.add("body_code", f.body);  
				   
                	code.addCode(template.render());
			//System.err.println(code);
		}
	
                return code;
	}


        
        @Override
        public CodeFragment visitStatements(AcodeParser.StatementsContext ctx) {
                CodeFragment code = new CodeFragment();
                for(AcodeParser.StatementContext s: ctx.statement()) {
                        CodeFragment statement = visit(s);
                        code.addCode(statement);
                        code.setRegister(statement.getRegister());
                }
                return code;
        }

        @Override
        public CodeFragment visitEmp(AcodeParser.EmpContext ctx) {
                return new CodeFragment();
        }

}
