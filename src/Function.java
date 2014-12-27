import java.util.ArrayList;
public class Function{
 	public String name;
	public ArrayList<String> arguments=new ArrayList<String>(); 
	public CodeFragment body;

	Function(String name, ArrayList args, CodeFragment body){
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

}
