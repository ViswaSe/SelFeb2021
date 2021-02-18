package week1.day2;

import java.util.Scanner;

public class ArmstrongNumberInForLoop {

	public static void main(String args[])
	{
		System.out.println("Enter the number to find out whether it is armstrong or not:");
		Scanner obj = new Scanner(System.in);
		int input = obj.nextInt();
		int result=input;
		
		int eachDigit;
		int sum=0;
		
		int count=0;
		
		while(input>0)
		{
			input=input/10;
			count++;
		}
		
		input=result;
	
		for(int i=0;i<count;i++)
		{
			eachDigit=input%10;
			input=input/10;
			sum=(int) (sum+Math.pow(eachDigit, count));		
		}
	
		System.out.println(sum);
		
		if(sum==result)
		{
			System.out.println("Given number "+result+" is an armstrong number");
		}
		else
		{
			System.out.println("Given number "+result+" is not an armstrong number");
		}
		
		obj.close();
	}
	
}
