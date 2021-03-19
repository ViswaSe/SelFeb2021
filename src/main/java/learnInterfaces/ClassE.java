package learnInterfaces;

public class ClassE implements Interface1,Interface2{
	
	public static void main(String args[])
	{
		ClassE objec = new ClassE(); //object creation
		objec.jay();
		objec.vichu();
		objec.durga();
		
		Interface1 ob = new ClassE(); //reference creation 
		ob.jay();
		System.out.println(ob.i);
		
		Interface2 obj = new ClassE();
		obj.durga();
		obj.vichu();
		

	
	}

	public void durga() {
		System.out.println("Durga");
		
	}

	public void vichu() {
		System.out.println("Vichu");
	}

	public void jay() {
		System.out.println("Jay");
		
	}

}
