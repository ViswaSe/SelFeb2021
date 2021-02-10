package week1.day1;

public class LearnBasicForLoop {
	
	public static void main(String args[])
	{
		//Print the even numbers from 1 to 100
		for(int i=1;i<=100;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
		
		//Print the only number divisible by 7 in reverse order from 100 to 1
		
		System.out.println("Program 2:");
		
		for(int i=100;i>=1;i--)
		{
			if(i%7 == 0)
			{
				System.out.println(i);
			}
		}
		
	}

}
