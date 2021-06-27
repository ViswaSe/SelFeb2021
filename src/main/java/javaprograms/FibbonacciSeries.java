package javaprograms;

public class FibbonacciSeries {
	
	public static void main(String args[])
	{
		int n1=-1;
		int n2=1;
		
		//int n3;
		
		for(int i=0;i<10;i++)
		{
			/*n3=n1+n2;
			n1=n2;
			n2=n3;*/
			
			n2=n1+n2;
			n1=n2-n1;
			
			System.out.println(n2);
		}
	}

}
