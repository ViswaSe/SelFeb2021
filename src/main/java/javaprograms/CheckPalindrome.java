package javaprograms;

import java.util.Scanner;

public class CheckPalindrome {
	
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
		
		if(s.equals(s1))
		{
			System.out.println("Given string: "+s+" is a palindrome");
		}
		else
		{
			System.out.println("Given string: "+s+" is not a palindrome");
		}
		
		obj.close();
	}
}
