package javaprograms;

public class Day6_StringArray {
	
	public static void main(String args[])
	{
		String[] s= {"vichu","shiva","shiva","vichu","shivaya namaha","swaminathan"};
		
		String s1="";
		
		for(int i=0;i<s.length;i++)
		{
			if(i!=s.length-1)
			{
				s1=s1+Character.toString(s[i].charAt(0)).toUpperCase()+".";
			}
			else
			{
				s1=s1+s[i].toUpperCase();
			}
		}
		
		System.out.println(s1);
	}

}
