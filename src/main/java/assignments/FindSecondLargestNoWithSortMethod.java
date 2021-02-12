package assignments;

import java.util.Arrays;

public class FindSecondLargestNoWithSortMethod {
	
	public static void main(String args[])
	{
		int[] num = {10,2,35,5,61,16,9};
		
		Arrays.sort(num);
	
		int secondLargest = num[num.length-2];
		
		System.out.println("Second largest number is: "+secondLargest);
	}

}
