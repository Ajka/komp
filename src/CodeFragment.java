import java.util.ArrayList;
public class CodeFragment {
        private String code;
        private String register;
	private ArrayList<String> args;
	private ArrayList<String> params;

        public CodeFragment() {
                this.code = "";
                this.register = null;
		this.args=new ArrayList<String>();
        }

        public void addCode(String code) {
                this.code += code;
        }

        public void addCode(CodeFragment fragment) {
                this.code += fragment.toString();
        }

        public String toString() {
                return this.code;
        }

        public void setRegister(String register) {
                this.register = register;
        }

        public String getRegister() {
                return this.register;
        }

	public ArrayList<String> args_list(){
		//System.err.println(this.args.get(0));
		return this.args;
	}
	public void addArg(String x){
		this.args.add(x);
	}
	public String args_code(){
		String code="";
		if(args.size()>0){
			code=code.concat("i32 "+args.get(0));
			for(int i=1;i<args.size();i++){
				code=code.concat(","+"i32 "+args.get(i));		
			}
		}
		//System.err.println(arguments.size());
		return code;
		
	}

	public void appendCodeFragment(CodeFragment fragment) {
                this.addCode(fragment);
                this.setRegister(fragment.getRegister());
        }	
}
