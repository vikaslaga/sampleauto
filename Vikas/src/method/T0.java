package method;

public class T0 {
int a=10;
int b=15;
public static int m1(int x,int y) {
	int div= (x/y);
	System.out.println(div);
	return div;
}
public int m2() {
	int mul=a*b;
	System.out.println(mul);
	return mul;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1(14,7);
T0 ref =new T0();
ref.m2();
	}

}
