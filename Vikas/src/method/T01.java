package method;

public class T01 {
int x=15;
int z=15;
static int a=5;
static int b=5;
public static void m1() {
	int div=a/b;
	System.out.println(div);
	int z=15;
	System.out.println(z);
	}
public void m2() {
	int min=x-z;
	System.out.println(min);}
	
	public static void main (String []args) {
		m1();
		T01 ref =new T01();
		ref.m2();
		
}
}
