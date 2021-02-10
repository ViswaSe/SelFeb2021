package week1.day1;

public class LearnIfCondition {
	
	public void verifyAge(int age)
	{
		if(age < 18)
		{
			System.out.println("minor");
		}
		else if(age >= 18 && age <60)
		{
			System.out.println("major");
			System.out.println("eligible to vote");
		}
		else if(age >= 60 && age <80)
		{
			System.out.println("senior person");
		}
		else
		{
			System.out.println("super senior person");
		}
	}
	
	public static void main(String args[])
	{
		int age=50;
		
		LearnIfCondition obj = new LearnIfCondition();
		obj.verifyAge(age);
	}

}
