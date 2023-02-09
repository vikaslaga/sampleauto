package method;

public class T {

	

	int x=15;
	int y=14;
	static int z=14;
	static int s=16;
	
	public static int  m1() {
		int sum=z+s;
		System.out.println(sum);
		return sum;
	}
	public int m2() {
		int sub=x-y;
		System.out.println(sub);
		return sub;
		
	}
	
	
	
	public static void main(String[] args) {
	
m1();
T ref=new T();
ref.m2();

	}

}
