package assignments;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		
		int fact=1;
		
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
		obj.close();
	}

}
