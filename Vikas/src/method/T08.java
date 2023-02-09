package method;

public class T08 {
int x=1;
int y=5;
static int c=4;
static int v=5;

public static int m1() {
	int sum=c+v;
	System.out.println(sum);
	return sum;
}
public int m2() {
	int min=y-x;
	System.out.println(min);
	return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
T08.m1();
T08 ref=new T08();
ref.m2();
	}

}
