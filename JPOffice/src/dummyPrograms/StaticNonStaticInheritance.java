package dummyPrograms;



public class StaticNonStaticInheritance extends BaseClass {
	
	public static int b =10;
	 int c=20;
	 public static void read()
	 {
		 System.out.println("I can read");
	 }
	 public  void write()
	 {
		 System.out.println("I can write as well");
	 }
	 
	 StaticNonStaticInheritance()//This is constructor and at the time 
	 //of object creation automatically constructor block will be called.
	 {
		 System.out.println("I am in Constructor Class");
	 }
	 
	 @Override
	public void swim()
	 {
		System.out.println("I can swim hard"); 
	 }
	

	
	
	
	
	public static void main(String[] args)
	{
		int a=5;//local variable
		System.out.println("Local Variable "+ a);//5
		System.out.println("Global Variable "+ b);//10
		StaticNonStaticInheritance A=new StaticNonStaticInheritance();//constructor will call
		 BaseClass bc=new BaseClass();//base class object created
		 bc.swim();//I can swim
		 bc.walk();
		 bc.laugh();
		System.out.println("Non static variable "+ A.c);
		read();//static method
		A.write();//non static method
		A.swim();//Called from BaseClass which is a parent class
		A.sleep();
		A.walk();
		A.laugh();
				
	}
	
	
	public void sleep()
	{
		System.out.println("sleep");
	}
	
}
