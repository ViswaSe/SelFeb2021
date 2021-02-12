package week1.day2;

public class LearnControlStatements {
	
	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				System.out.println("Three");
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("****************************");
		
		for(int i=1;i<=5;i++)
		{
			if(i==4)
			{
				System.out.println("Four");
				break;
			}
			System.out.println(i);
		}
	
	}

}
