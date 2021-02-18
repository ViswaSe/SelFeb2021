package week3.day1;

public class LearnThisKeyword extends CalculatorOverloading{
	
	int empId=100;
	String empName="Vishveshwar";
		
	public LearnThisKeyword(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
		System.out.println(empId);
		System.out.println(empName);
	}
	
	public static void main(String args[])
	{
		LearnThisKeyword obj = new LearnThisKeyword(200,"Jay");
	}

}
