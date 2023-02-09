package forwhlleloop;

public class T08 {

	public static void main(String[] args) {
	int x=11;
	int i;
	boolean flag=true;
	for(i=2;i<x;i++) {
		if(x%i==0) {
			flag=false;break;
					}}
		if(flag==true) {
			System.out.println("prime no");
		}
		else {
			System.out.println("not prime no");
		}

	}

	
	
}
