package week3.day1;

public class LearnConstructor extends CalculatorOverloading{
	
	int empId;
	String empName;
		
	public LearnConstructor()
	{
		empId=100;
		empName="Vishveshwar";
		System.out.println(empId);
		System.out.println(empName);
	}
	
	public LearnConstructor(int empId,String empName)
	{
		System.out.println(empId);
		System.out.println(empName);
	}
	
	public static void main(String args[])
	{
		LearnConstructor obj = new LearnConstructor(200,"Vishveshwar");
	}

}
