package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ArrayTask {
	
	public static void main(String args[])
	{
		int[] a = {10,20,25,20,5};
		int[] b = {25,25,5,20,20};
		
		a=sortArray(a);
		b=sortArray(b);
	
		//Add the first array into the set to remove the duplicates
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i:a)
		{
			set.add(i);
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		
		//create a map and validate the set value to the b array and store the repetition of each values in the map
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(list.get(i)==b[j])
				{
					if(map.containsKey(list.get(i)))
					{
						int count=map.get(list.get(i));
						map.put(list.get(i),count+1);
					}
					else
						map.put(list.get(i),1);
				}
			}
		}
		
		//To remove the extra duplicates from the map 
		int count=0;	
		for(Entry<Integer, Integer> eachSet: map.entrySet())
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
				if(eachSet.getKey()==a[i])
				{
					count=count+1;
				}
			}
			if(count<eachSet.getValue())
			{
				map.put(eachSet.getKey(), count);
			}
		}
		
		System.out.println(map);
		
	}
	
	public static int[] sortArray(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
