package javaprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountOfCharactersUsingMap {
	
	public static void main(String args[])
	{
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		Scanner obj = new Scanner(System.in);
		String s = obj.next();
		
		int count=1;
		
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				count=map.get(s.charAt(i));
				map.put(s.charAt(i), count+1);
			}
			else
				map.put(s.charAt(i), count);
		}
		
		for(Entry<Character,Integer> each:map.entrySet())
		{
			System.out.println(each.getKey()+"-"+each.getValue());
		}
		
		obj.close();
	}
}
