package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class T01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] arrays = {"pune","nashik","dilhi","pune","nashik"};

HashSet<String> hs=new HashSet<String>(Arrays.asList(arrays));
System.out.println(hs);

LinkedHashSet <String> lhs= new LinkedHashSet<String>(Arrays.asList(arrays));
System.out.println(lhs);
	}

}
