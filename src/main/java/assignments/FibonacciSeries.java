package assignments;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String args[])
	{
		int a = -1;
		int b = 1;
		
		int temp;
		
		Scanner obj = new Scanner(System.in);
		int length = obj.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<length;i++)
		{
			temp=a+b;
			a=b;
			b=temp;
			
			System.out.println(temp);
		}
		
		
	}

}
