package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
	public static List<String> list;
	
	public static void main(String args[])
	{
		String s = "ABCD";
		int n = s.length();
		
		list = new ArrayList<String>();
		
		Permutations obj = new Permutations();
		obj.permutate(s,0,n-1); //ABC 0 2
		
		System.out.println(list.size());
		
	}
	
	public void permutate(String s, int length, int radius)
	{
				
		if(length == radius)  //0!=2  //1!=2
		{
			System.out.println(s);
			list.add(s);
		}
		else 
		{
			for(int i=length;i<=radius;i++)  
			{
				s=swap(s,length,i);  						//0,0 (3) - ABC //0,1 - 
				permutate(s,length+1,radius);    			
			}
		}
	}
	
	public String swap(String s, int i, int j)
	{
		char temp;
		char[] cArray = s.toCharArray();
		temp=cArray[i];
		cArray[i]=cArray[j];
		cArray[j]=temp;
						
		return String.valueOf(cArray);
		
	}

}
