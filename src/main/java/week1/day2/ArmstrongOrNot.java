package week1.day2;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String args[])
	{
		System.out.println("Enter the number to find out whether it is armstrong or not:");
		Scanner obj = new Scanner(System.in);
		int input = obj.nextInt();
		int result=input;
		
		int eachDigit;
		int sum=0;
		
		while(input>0)
		{
			eachDigit=input%10;
			sum=sum+(eachDigit*eachDigit*eachDigit);
			input=input/10;
		}
		
		if(sum==result)
		{
			System.out.println("Given number "+result+" is an armstrong number");
		}
		else
		{
			System.out.println("Given number "+result+" is not an armstrong number");
		}
	}
	
}
