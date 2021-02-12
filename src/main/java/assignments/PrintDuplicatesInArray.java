package assignments;

import java.util.Arrays;

public class PrintDuplicatesInArray {
	
	public static void main(String args[])
	{
		int[] arr= {10,2,9,55,18,9,0,11,6,66,87,10,19,20,66};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.println(arr[i]);
			}
		}
	}

}
