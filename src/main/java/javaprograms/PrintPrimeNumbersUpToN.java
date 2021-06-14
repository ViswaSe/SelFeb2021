package javaprograms;

import java.util.Scanner;

public class PrintPrimeNumbersUpToN {
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number to print the prime numbers until the given number: ");
		int n = obj.nextInt();
		
		boolean flag = false;
		
		for(int i=1;i<=n;i++)
		{
			if(i==1 || i==2)
			{
				flag = true;
			}
			
			else
			{
				for(int j=2;j<i;j++) //i=3,j=2 2<3    i=3,j=3 3<3  || 2 times loop iterated
				{
					if(i%j==0) 
					{
						flag = false;
						break;
					}
					else 
						flag = true; //true 
				}
				
			}
			
			if(flag)
			{
				System.out.println(i);
			}
		}
	}
}
