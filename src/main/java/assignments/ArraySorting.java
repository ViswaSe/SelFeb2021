package assignments;

public class ArraySorting {
	
	public static void main(String args[])
	{
		int[] num = {10,2,5,19,88,8,18,7,6,100,25,29};
		int temp;
		
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting in ascending order: ");
		for(int each:num)
		{
			System.out.println(each);
		}
		
	}

}
