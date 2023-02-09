package controlstatement;

import java.util.Scanner;

public class T0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int per=sc.nextInt();
if(per<=35) {
	System.out.println("student is fail");
}
else if(per>=35 && per<=50) {
	System.out.println("c grade ");
}
else if(per>=51&&per<=60) {
	System.out.println("B grade");
}
else if(per>=61&& per<=80) {
	System.out.println("A grade");
}
else {
	System.out.println("A + grade");
}
	}

}
