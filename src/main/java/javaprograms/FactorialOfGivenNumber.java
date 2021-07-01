package javaprograms;

public class FactorialOfGivenNumber {
	
	public static void main(String args[])
	{
		int result=1;
		
		int fact=6;
		
		for(int i=fact;i>=1;i--)
		{
			result=result*i;
		}
		
		System.out.println(result);
	}

}
