package week1.day2;

public class MyCalculator {
	
	public static void main(String args[])
	{
		Calculator cal = new Calculator();
		
		int sum,sub;
		double mul;
		float div;
		
		sum=cal.add(5, 10, 15);
		sub=cal.sub(20, 10);
		mul=cal.mul(10.3, 5.2);
		div=cal.div(7, 2);
		
		System.out.println("Addition is: "+sum);
		System.out.println("Subraction is: "+sub);
		System.out.println("Multiplication is: "+mul);
		System.out.println("Division is : "+div);
	}

}
