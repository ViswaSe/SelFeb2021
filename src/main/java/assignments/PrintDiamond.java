package assignments;

import java.util.Scanner;

public class PrintDiamond {
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = obj.nextInt();
		
		int input = n;
		
		for(int i=0;i<n;i++)
		{
			for(int k=input-1;k>0;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			input=input-1;
		}
		
		
		for(int i=0;i<n;i++)
		{
			
			for(int k=0;k<=input;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=input;j<n-1;j++)
			{
				System.out.print("*" +" ");
			}
		
			input=input+1;
			System.out.println();
		}
		
		obj.close();
	}

}
