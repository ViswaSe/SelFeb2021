package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArray {
	
	public static void main(String args[])
	{
		String[] str= {"Hcl","Wipro","Aspire Systems","CTS"};
		
		List<String> list = new ArrayList<String>();
		
		for(String each:str)
		{
			list.add(each);
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(String each:list)
		{
			System.out.println(each);
		}
	}

}
