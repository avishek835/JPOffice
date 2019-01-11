package dummyPrograms;

import java.util.ArrayList;

public class LogicalPrograms {
	 static String str;
	public static void main(String[] args) 
	{
//Fibonnaci series
        int n = 20, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " , ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        
       // reverse a string
         str = "Avishek";
        String reverse = "";
        
        
        for(int i = str.length()-1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
        
        System.out.println("--------Using reverse method-----------");
        
        
       
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(20);
        al.add(30);
        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println(al.get(1));
	}
	
	
	
}
