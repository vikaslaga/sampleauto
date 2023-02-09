package string;

public class T04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="avbsvxfsdagzbsgsbxv";
char c[]=s.toCharArray();
int z=c.length;
int i=0;
int j=0;
int counter=0;
for(i=0;i<z;i++) {
	counter=0;
	for(j=0;j<z;j++) {
		if(j<i&&c[i]==c[j]) {
			break;
		}
		if(c[j]==c[i] ){
			counter++;
		}
		if(j==z-1) {
			System.out.println("The character " +c[i]+ " is present " +counter+ " times");
		}
		
	}
}
	}

}
