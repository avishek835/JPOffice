package dummyPrograms;

public class StringPrograms {

	public static void main(String[] args) {
		
		//compare string
		String A= "Avishek";
		String B= "Avishek";
		
		if(A==B)
			System.out.println("Matching");
		else
			System.out.println("NotMatching");
		
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
