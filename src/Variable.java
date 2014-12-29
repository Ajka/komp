class Variable {
	public String type;
	public String register;


	public Variable(String register, String type) {
		this.register = register;
		this.type = type;
	}

	public static String getLLVMType(String t) {
		String type="";
		switch (t) {
                        case "int":
                                t="i32";
                                break;
                        case "bool":
                                t="i1";
                                break;
                        case "void":
                        		t="void";
                        		break;        
        }
		return t;
	}
}
