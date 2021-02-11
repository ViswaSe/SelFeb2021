package assignments;

import java.util.Scanner;

public class GivenNumberPrimeOrNot {
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int input = obj.nextInt();
		
		boolean flag = true;
		
		for(int i=2;i<input/2;i++)
		{
			if(input % i == 0)
			{
				flag = false;
			}
		}
		
		if(flag)
		{
			System.out.println("Given number:"+input+" is a prime number");
		}
		
		else
		{
			System.out.println("Given number: "+input+" is not a prime number");
		}
		
	}

}
