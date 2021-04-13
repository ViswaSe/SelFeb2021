package pages;

public class RemoveDuplicates {
	
	public static void main(String args[])
	{
		String s="we learn learn java basics in week1 java week1 classes classes";
		String[] str=s.split(" ");
		
		int count=0;
		
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					if(count>=1)
					{
						str[j]="";
					}
				}
			}
		}
		
		for(String each:str)
			System.out.println(each);
	}

}
