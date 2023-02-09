package variable;

public class Variable {
	 int y=14;
	static int x=15;

	public static void main(String[] args) {
		
		Variable ref =new Variable();
		System.out.println(ref.y);
		System.out.println(Variable.x);
		
		
	}

}
