package weeklyassignments;

public class RemoveDuplicatesInString {
	
	public static void main(String args[])
	{
		String str = "We learn java basics as part of java sessions java in java week1";
		int count=0;
		String[] input=str.split(" ");
		
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				count=0;
				if(input[i].equals(input[j]))
				{
					count++;
				}
				if(count>=1)
				{
					input[j]="";
				}
			}
		}
		
		//Print the output by removing duplicates
		String output="";
		for(String each:input)
		{
			if(!(each.equals("")))
			{
				output=output+each+" ";
			}
		}
		System.out.println(output);
	}

}
