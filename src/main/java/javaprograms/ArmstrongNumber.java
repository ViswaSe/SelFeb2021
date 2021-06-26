package javaprograms;

public class ArmstrongNumber {
	
	public static void main(String args[])
	{
		int n = 408;  //4 
		int n1=n;
		int count=0;
		
		while(n1>0)
		{
			n1=n1/10;
			count++;
		}
		
		int temp;
		int result;
		int sumValue=0;
		
		for(int i=0;i<count;i++)
		{
			temp=n%10;
			result=1;
			for(int j=0;j<count;j++)
			{
				result=result*temp; //4 //16 //64 //216
			}
			
			n=n/10;
			sumValue=sumValue+result;
		}
		
		System.out.println(sumValue);
		
	}
	

}
