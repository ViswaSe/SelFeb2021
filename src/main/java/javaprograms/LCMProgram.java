package javaprograms;

public class LCMProgram {
	
	//Least common multiple
	public static void main(String args[])
	{
		int num1=51;
		int num2=45;

		int limit,div;
		
		if(num1>num2)
		{
			limit=num1;
			div=num2;
		}
			
		else
		{
			limit=num2;
			div=num1;
		}
		
		int mul=1;
		
		for(int i=1;i<=limit;i++)
		{
			mul=i*limit; //16 //32 //48 //64 //80 //96
			
			if(mul%div==0)
			{
				System.out.println("LCM for the given 2 number is: "+mul);
				break;
			}
		}
		
		
	}
}
