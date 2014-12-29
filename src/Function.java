import java.util.ArrayList;
public class Function{
	private String type;
 	public String name;
	public ArrayList<String> arguments=new ArrayList<String>(); 
	public CodeFragment body;

	Function(String type, String name, ArrayList args, CodeFragment body){
		this.type=type;
		this.name=name;
		this.arguments=args;
		this.body=body;
	}
	public String args(){
		String code="";
		if(arguments.size()>0){
			code=code.concat("i32 "+arguments.get(0));
			for(int i=1;i<arguments.size();i++){
				code=code.concat(","+"i32 "+arguments.get(i));		
			}
		}
		//System.err.println(arguments.size());
		return code;
		
	}
	public String type(){
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

}
