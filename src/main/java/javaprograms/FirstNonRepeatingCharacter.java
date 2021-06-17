package javaprograms;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		String s = obj.next();
		
		String s1=s;
		
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					s1=s1.replaceAll(""+s.charAt(i), "");
				}
			}
		}

		System.out.println("First Non repeating character in the given string is: "+s1.charAt(0));
		
		obj.close();
		
	}

}
