package assignments;

import java.util.Scanner;

public class FibbonacciSeriesWithoutTemp {

	public static void main(String args[])
	{
		int a = -1;
		int b = 1;
		
		Scanner obj = new Scanner(System.in);
		int length = obj.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<length;i++)
		{
			b = a+b; // 0 1 1 2 3 5 .. 
			a = b-a; // 1 0 1 1 2 3 .. 
			
			System.out.println(b);   // -1 1 0 1 1 2 3 5 7 
		}
		
		obj.close();
		
	}
	
}
