package javaprograms;

public class GreatestCommonDivisor {
	
	public static void main(String args[])
	{
		int a = 50;
		int b = 24;
		
		int n;
		
		if(a>b)
			n=a;
		else
			n=b;
		
		int gcd=1;
		
		for(int i=1;i<=n;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd = i;
			}
		}
		
		System.out.println(gcd);
	}

}
