package constructor;

public class T {
	String name ;
	char div;
	int rollNo;
	public T (String n,char c,int r){
		this.name=n;
		this.div=c;
				this.rollNo=r;
	}


	public static void main(String[] args) {
	T ref= new T("vikas",'a',54);
	System.out.println(ref.name);
	System.out.println(ref.div);
	}
}
