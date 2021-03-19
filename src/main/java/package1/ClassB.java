package package1;

public class ClassB{
	
	public static void main(String args[])
	{
		ClassA obj = new ClassA();
		obj.run(); //different class same package - public method calling - yes
		// obj.slow();  //different class same package - private method calling - No
		obj.speed(); //different class same package without extends - protected method calling - yes
		obj.stop(); //different class same package without extends - default method calling - yes
	}

}
