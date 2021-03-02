package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnListAndSet {
	
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		
		//To add the elements in the list
		list.add("Sathish");
		list.add("Vishveshwar");
		list.add("Shakul");
		list.add("Jay");
		list.add("Ramana");
		list.add("Aswin");
		list.add("Ani");
		list.add("Shakul");
		
		//Print the element in ascending order
		Collections.sort(list);
		Collections.reverse(list);
		
	/*	//use for-each loop
		for(Object each:list)
		{
			System.out.println(each);
		}*/
		
		//print the last element in the list
		System.out.println(list.get(list.size()-1));
		
		//Add the list to the set
		Set<String> set = new LinkedHashSet<String>();
		set.addAll(list);
		
		//print the set to check the duplicate is removed or not
		System.out.println("Elements in the set:");
		for(Object each:set)
		{
			System.out.println(each);
		}
		
		
	}

}
