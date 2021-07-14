package javaprograms;

public class LargestNumberInAnArray {
	
	public static void main(String args[])
	{
		int[] a = {10,2,15,33,-8,188,9,1,94,122};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j] && a[j]>max)
				{
					max=a[i];
				}
			}
		}
		
		if(a[a.length-1]>max)
		{
			max=a[a.length-1];
		}
		
		System.out.println(max);
	}

}
