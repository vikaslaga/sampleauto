package forwhlleloop;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for(int i=2;i<=150;i++) {
	int x=1;
	for(int j=2;j<i;j++) {
		if(i%j==0) {
			x=x+1;break;
			
		}
	}

if(x==1) {
	System.out.print(i+",");
}
}
	}

}
