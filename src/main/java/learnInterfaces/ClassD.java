package learnInterfaces;

public class ClassD implements Interface1,Interface2 {

	public void vichu() {
		System.out.println("Vichu method");		
	}

	public static void main(String args[])
	{
		ClassD s = new ClassD();
		s.vichu();s.durga(); //method calling - objectname.methodname();
		System.out.println(s.i); //variable calling - objectname.variablename
	}

	public void durga() {
		System.out.println("Durga method");
		
	}

	public void jay() {
		// TODO Auto-generated method stub
		
	}

}
