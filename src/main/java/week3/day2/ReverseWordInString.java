package week3.day2;

public class ReverseWordInString {
	
	public static void main(String args[])
	{
		String s="Welcome";
		
		String str="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		
		System.out.println(str);
		
		char[] cc= str.toCharArray();
		
		for(int i=cc.length-1;i>=0;i--)
		{
			System.out.print(cc[i]);
		}
	}

}
