package week3.day1;

public class LearnStatic {
	
	int empId;
	String empName;
	static String compName;
	
	public LearnStatic()
	{
		empId=100;
		empName="Vishveshwar";
		compName="Sedin";
	}
	
	public LearnStatic(int empId,String empName,String compName)
	{
		this.empId=empId;
		this.empName=empName;
		this.compName=compName;
	}
	
	public void printResults()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(compName);
	}
	
	public static void main(String args[])
	{
		LearnStatic ob1 = new LearnStatic();
		ob1.printResults(); //If you print here it will take the compName as Sedin which is assigned in your global variable
		
		LearnStatic ob2 = new LearnStatic(100,"Vishveshwar","TestLeaf");
		ob1.printResults(); //If you print here with the same object name the static value got changed and it will take the latest company name value
	}
	
}
