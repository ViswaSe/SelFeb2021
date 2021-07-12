package javaprograms;

public class SmallestNumberInAnArray {
	
	public static void main(String args[])
	{
		int[] a = {10,2,15,33,-8,18,9,1,-4};
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j] && a[i]<min)
				{
					min=a[i];
				}
			}
		}
		if(min>a[a.length-1])
		{
			min=a[a.length-1];
		}
		
		System.out.println(min);
	}

}
