package assignments;

public class LargestValueOfArray {
	
	public static void main(String args[])
	{
		int[] arr= {173,29,320,41,103,1130,547};
		
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
		
		System.out.println(largestNo);
	}

}
