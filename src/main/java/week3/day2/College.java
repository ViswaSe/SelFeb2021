package week3.day2;

public class College extends University{

	@Override
	public void ug() {
		System.out.println("UG degree : Bsc. computer science");
	}
	
	public static void main(String args[])
	{
		College obj = new College();
		obj.pg();obj.ug();
	}
}
