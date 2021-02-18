package week3.day1;

public class CalculatorOverloading {
	
	public CalculatorOverloading()
	{
		System.out.println("Parent class constructor");
	}

	public void add(int a,int b)
	{
		System.out.println("Addition of 2 integers: "+(a+b));
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println("Addition of 3 integers: "+(a+b+c));
	}
	
	public void mul(int a,int b)
	{
		System.out.println("Multiplication-1: "+(a*b));
	}
	public void mul(int a,double b)
	{
		System.out.println("Multiplication-2: "+(a*b));
	}
	
	public void sub(int a,int b)
	{
		System.out.println("Subraction is: "+(a-b));
	}
	
	public void sub(double a,double b)
	{
		System.out.println("Subraction is: "+(a-b));
	}
	
	public void div(int a,int b)
	{
		System.out.println("Division-1: "+(a/b));
	}
	
	public void div(double a,int b)
	{
		System.out.println("Division-2: "+(a/b));
	}
	
	public static void main(String args[])
	{
		CalculatorOverloading obj = new CalculatorOverloading();
		obj.add(4, 6);
		obj.add(5, 5, 10);
		obj.sub(2.5, 1.2);
		obj.sub(6, 2);
		obj.mul(5, 2.8);
		obj.mul(2, 2);
		obj.div(9.4,2);
		obj.div(5, 5);
	}
}
