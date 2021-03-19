package assignments;

public class LargestValueOfArray {
	
	public static void main(String args[])
	{
		int[] arr= {100,20,300,40,50,60,70};
		
		int largestNo = 0;
		int temp=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j] && temp<arr[i])
				{
					largestNo=arr[i];
				}
			}
			temp=largestNo;
		}
		
		if(temp==0)
		{
			temp=arr[arr.length-1];
		}
		
		System.out.println(temp);
	}

}
