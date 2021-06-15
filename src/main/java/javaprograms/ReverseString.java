package javaprograms;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string for input:");
		String s=obj.next();
		
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		
		System.out.println(s1);
		
		obj.close();
	}
}
