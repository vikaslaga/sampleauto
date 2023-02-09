package whlleloop;

public class T04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=0;
int y=1;
while(x<=300) {
	System.out.println(x);
	int t=y;
	y=x+y;
	x=t;
}
	}

}
