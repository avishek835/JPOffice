package dummyPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Array {
	static String s;
	public static void main(String[] args) {
		String[] a= {"a","b"};
		 s=a[0];
		 
		 System.out.println(s);
		 s=a[1];
		 System.out.println(s);
		 
		 String[] b=new String[2];
		 b[0]="c";
		 b[1]="d";
		 System.out.println(b.length);
		 System.out.println(b[0]);
		 System.out.println(b[1]);
		 
		 ArrayList<String> al=new ArrayList<String>();
		 al.add(0, "1");
		 al.add(1,"2");
		 System.out.println(al.get(0));
		 System.out.println(al.get(1));
		 
		 HashMap<String, String> hm=new HashMap<String, String>();
		 hm.put("2", "1");//not synchronised
		 hm.put("0", "1");
		 hm.put("1", "2");
		 
		 System.out.println(hm);
		 Hashtable<String, String> ht=new Hashtable<String, String>();
		 ht.put("2", "C");
		 ht.put("0", "A");//synchronized
		 ht.put("1", "B");
		
		 System.out.println(ht);
		 
		 
		 
		 
		 
		 

	}

}
