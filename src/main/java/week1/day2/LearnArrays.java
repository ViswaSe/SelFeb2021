package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String args[])
	{
		/*
		 * int[] arr= new int[5];
		 * 
		 * //Insert the elements in array for(int i=0;i<arr.length;i++) {
		 * arr[i]=(i+1)*10; }
		 */
		
		int[] arr= {10,35,55,70,18,2};
		
		//To get the first index in array:
		System.out.println(arr[0]);
		
		//To get the last index in array:
		System.out.println(arr[arr.length-1]);
		
		//To sort the array
		Arrays.sort(arr);
		System.out.println("************************************");
		//To print the array elements in the ascending order using for each loop
		for(int each:arr)
		{
			System.out.println(each);
		}
		
		System.out.println("************************************");
		//To print it in descending order
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
}
