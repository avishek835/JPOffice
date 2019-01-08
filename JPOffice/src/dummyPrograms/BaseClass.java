package dummyPrograms;

public class BaseClass implements Inter{
	
	public void swim()
	{
		System.out.println("I can swim");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk");
		
	}

	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		System.out.println("laugh");
		
	}

}
