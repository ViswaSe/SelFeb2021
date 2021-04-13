package weeklyassignments;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the Input number: ");
		Scanner obj = new Scanner(System.in);
		int input = obj.nextInt();
		
		int n=input;
		
		//To get the count
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		
		//Armstrong number strategy
		n=input;
		int sum=0;
		int cube=0;
		
		while(n>0)
		{
			int rem=n%10;
			switch(count)
			{
				case 2: cube=rem*rem;break;
				case 3: cube=rem*rem*rem;break;
				case 4: cube=rem*rem*rem*rem;break;
			}
			sum=sum+cube;
			n=n/10;
		}
		
		System.out.println("Sum value is: "+sum);
		
		if(sum==input)
		{
			System.out.println("Given number: "+input+" is an armstrong number");
		}
		else
		{
			System.out.println("Given number: "+input+" is not an armstrong number");
		}
	}

}
