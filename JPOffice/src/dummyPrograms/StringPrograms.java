package dummyPrograms;

public class StringPrograms {

	public static void main(String[] args) {
		
		//compare string
		String A= "Avishek";
		String B= "Avishek";
		StringBuffer STBR = new StringBuffer(B);
		System.out.println(STBR.toString());
		System.out.println(STBR.reverse());
		System.out.println(STBR.toString());
		
		int C=2;
		int D=1;
		if(A==B)
			System.out.println("Matching");
		else {
			System.out.println("NotMatching");
		}
		System.out.println(A.length());
		System.out.println(A.substring(0, 3));
		System.out.println(A.charAt(3));
		if(C>D)
			System.out.println("bigger");
		else {
			System.out.println("Not bigger");
		}
		
		
		
		// reverse a string
		 String str = "Avishek";
	    	StringBuilder sb = new StringBuilder(str);
	    	System.out.println(" string is:" +sb.toString());
	        System.out.println("Reversed string is:");
	        System.out.println(sb.reverse().toString());//it reverse the string and tostring return the same string
	        
	        StringBuffer SB=new StringBuffer("Avi");
	        System.out.println(SB.reverse());
	   
	}

}
