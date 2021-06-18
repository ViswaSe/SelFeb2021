package javaprograms;

public class Anagram {
	
	public static void main(String args[])
	{
		String s  = "Madam";
		String s1 = "damMa";
		
		String s2=s1;
		
		if(s.length()==s1.length())
		{
			for(int i=0;i<s.length();i++)
			{
				for(int j=0;j<s1.length();j++)
				{
					if(s2.contains(Character.toString(s.charAt(i))))
					{
						s2=s2.replaceFirst(""+s.charAt(i), "");
					}
				}
			}
			
			if(s2.length()==0)
			{
				System.out.println("Given words are anagram");
			}
			else
			{
				System.out.println("Given words are not an anagram");
			}
		}
		
		else
		{
			System.out.println("Given words are not anagram");
		}
		
		
		
	}

}
