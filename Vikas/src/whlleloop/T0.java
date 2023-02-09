package whlleloop;

public class T0 {

	public static void main(String[] args) {
		int x=142563;
		int rev=0;
		while(x!=0) {
			rev=rev*10+x%10;
			x=x/10;
		}
		System.out.println("Reverse no is " +rev);
}}