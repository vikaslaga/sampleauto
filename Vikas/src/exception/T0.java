package exception;

public class T0 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
int x=14;
try {
System.out.println(x/0);
}
catch(ArithmeticException e) {
	System.out.println(e.getClass());
}
System.out.println("inside the code");
	}

}
