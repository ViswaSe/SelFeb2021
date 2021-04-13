package weeklyassignments;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String args[])
	{
		System.out.println("Enter the input number: ");
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		
		int sum=0;
		
		while(n>0)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		System.out.println("Sum of Digits of a number: "+sum);
	}
}
