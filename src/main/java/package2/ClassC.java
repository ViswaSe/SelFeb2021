package package2;

import package1.ClassA;

public class ClassC { //(without extending class A)
	
	public static void main(String args[])
	{
		ClassA obj = new ClassA();
		obj.run(); // different class different package - public method calling - yes
		//obj.slow(); //different class different package - private method calling - no
		//obj.speed(); //different class different package - protected method calling - no
		//obj.stop(); //different class different package - default method calling - no
	}

}
