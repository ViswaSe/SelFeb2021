package package2;

import package1.ClassA;

public class ClassD extends ClassA {
	
	public static void main(String args[])
	{
		ClassD obj = new ClassD();
		obj.run(); // different class different package with extends - public method calling - yes
		//obj.slow(); //different class different package with extends - private method calling - no
		obj.speed(); //different class different package with extends - protected method calling - yes
		// obj.stop(); //different class different package with extends - default method calling - no
	}

}
