package weeklyassignments;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String args[])
	{
		String s="potss";
		String s1="stops";
		
		boolean flag=false;
		
		//Verify the length of string are same
		int n=s.length();
		int n1=s1.length();
		
		if(n==n1)
		{
			char[] c = s.toCharArray();
			char[] c1= s1.toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(c1);
			
			for(int i=0;i<c.length;i++)
			{
				if(c[i]==c1[i])
				{
					flag=true;
				}
				else
				{
					flag=false;
					break;
				}
			}
		}
		
		if(flag)
		{
			System.out.println("Given words are Anagram");
		}
		else
		{
			System.out.println("Given words are not Anagram");
		}
	}

}
