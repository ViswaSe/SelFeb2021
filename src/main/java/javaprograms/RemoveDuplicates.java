package javaprograms;

public class RemoveDuplicates {
	
	public static void main(String args[])
	{
		String s = "Vishveshwar";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s1.indexOf(s.charAt(i))==-1)
					s1=s1+s.charAt(i);
			}
		}
		
		System.out.println(s1);
	}
}
