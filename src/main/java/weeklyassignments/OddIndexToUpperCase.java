package weeklyassignments;

public class OddIndexToUpperCase {
	
	public static void main(String args[])
	{
		String test="jayakrishna";
		String str="";
		String temp;
		
		for(int i=0;i<test.length();i++)
		{
			if(i%2!=0)
			{
				temp=(""+test.charAt(i)).toUpperCase();
				str=str+temp;
			}
			else
			{
				str=str+test.charAt(i);
			}
		}
		
		System.out.println("Output: "+str);
	}

}
