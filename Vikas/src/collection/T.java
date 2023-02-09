package collection;

import java.util.ArrayList;

public class T {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("pune");
		ar.add("mumbai");
		ar.add("nashik");
		System.out.println(ar.size());
String[] arrays=new String[ar.size()];
ar.toArray(arrays);
for(String s:arrays) {
	System.out.println(s);
}
	}

}
