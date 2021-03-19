package learnInterfaces;

public class ClassInterface implements SampleInterface{

	public void m1() {
		System.out.println("Method 1");
		
	}

	public void m2() {
		System.out.println("Method 2");
		
	}
	
	public static void main(String args[])
	{
		ClassInterface obj = new ClassInterface();
		obj.m1();
		obj.m2();
	}

}
