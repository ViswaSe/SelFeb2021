package package1;

public class ClassA {
	
	public void run()
	{
		System.out.println("Run");
	}
	
	private void slow()
	{
		System.out.println("Slow");
	}
	
	protected void speed()
	{
		System.out.println("Speed");
	}
	
	void stop()
	{
		System.out.println("Stop");
	}
	
	public static void main(String args[])
	{
		ClassA obj = new ClassA();  
		obj.run(); //same class same package - public method calling - yes
		obj.slow(); //same class same package - private method calling - yes
		obj.speed(); //same class same package - protected method calling - yes
		obj.stop(); //same class same package - default method calling - yes
	}

}
