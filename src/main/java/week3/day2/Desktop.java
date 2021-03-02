package week3.day2;

public class Desktop implements Hardware,Software {

	public void softwareResources() {
		System.out.println("Software Resources");
	}

	public void hardwareResources() {
		System.out.println("Hardware Resources");
	}

	public void cpu() {
		System.out.println("Multiple inheritance is achieved successfully");
	}
	public void desktopModel()
	{
		System.out.println("This is class method");
	}
	
	public static void main(String args[])
	{
		Desktop obj = new Desktop();
		obj.softwareResources();
		obj.hardwareResources();
		obj.cpu();
		obj.desktopModel();
	}
}
