package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupCharacters {
	
	public static void main(String args[])
	{
		String input = "PayPal India";
		input=input.replaceAll("\\s", "");
		char[] cc= input.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		for(Character each:cc)
		{
			set.add(each);
		}
		
		List<Character> list = new ArrayList<Character>();
		list.addAll(set);
		set.clear();
		
		int count=0;
		
		for(int i=0;i<list.size();i++)
		{
			count=0;
			for(int j=0;j<cc.length;j++)
			{
				if(list.get(i)==cc[j])
				{
					count++;
				}
			}
			
			if(count<=1)
			{
				set.add(list.get(i));
			}
			
		}
		System.out.println(set);
	}

}
