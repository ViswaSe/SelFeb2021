package javaprograms;

import java.util.Scanner;

public class CountOfCharacters {
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		String s=obj.next();
		
		int count=1;
		String s1="";
		
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					if((s1.indexOf(s.charAt(i))==-1))
					{
						count++;
					}
				}
			}
			
			if(s1.indexOf(s.charAt(i))==-1)
			{
				System.out.println(s.charAt(i)+"-"+count);
			}
			
			count=1;
			s1=s1+s.charAt(i);
		}
		
		if(s1.indexOf(s.charAt(s.length()-1))==-1)
		{
			System.out.println(s.charAt(s.length()-1)+"-"+count);
		}
		
		obj.close();
		
	}
}
