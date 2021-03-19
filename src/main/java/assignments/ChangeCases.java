package assignments;

public class ChangeCases {
	
	public static void main(String args[])
	{
		String s = "Sathish Kaali";
		String str="";
		
		for(int i=0;i<s.length();i++)
		{
			int temp = (int) s.charAt(i); //type casting
			
			if(temp>=65 && temp<=90)
			{
				str=str+((""+s.charAt(i)).toLowerCase());
			}
			
			else
			{
				str=str+((""+s.charAt(i)).toUpperCase());
			}
		}
		
		System.out.println(str);
	}

}
