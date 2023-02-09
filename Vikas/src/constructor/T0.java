package constructor;

public class T0 {
public T0() {
	this(10);
	System.out.println("no argument ");
}
public T0(int x) {
	this("String");
	System.out.println("int argument");
}
public T0(String s) {
	System.out.println("string argument");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
T0 ref=new T0(5);

	}

}
