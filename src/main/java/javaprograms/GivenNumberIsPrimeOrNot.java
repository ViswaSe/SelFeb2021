package javaprograms;

import java.util.Scanner;

public class GivenNumberIsPrimeOrNot {
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number to find whether it is prime or not: ");
		int n = obj.nextInt();
		
		boolean flag = false;
		
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag = false;
				break;
			}
			
			else 
				flag = true;
		}
		
		if(flag)
		{
			System.out.println("Given number: "+n+" is a prime number");
		}
		else
		{
			System.out.println("Given number: "+n+" is not a prime number");
		}
	}

}
