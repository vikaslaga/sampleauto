package forwhlleloop;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=10;i++) {
	for(int j=1;j<=10;j++) {
		if(j==3) {
			continue;
		}
		if(j==5) {
			continue;
		}
		
		if(j==7) {
			continue;
		}
		if(j==9) {
			continue;
		}
		System.out.print(i*j+" ");
	}
	System.out.println();
}
	}

}
