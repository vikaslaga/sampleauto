package exception;

public class T {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.out.println("good work");
Thread.sleep(2000);
System.out.println("bad work");
Thread.sleep(1000);
try {
System.out.println(10/0);
}catch(ArithmeticException e) {
	System.out.println(e.getClass());
}
System.out.println("person wrk");
	}

}
