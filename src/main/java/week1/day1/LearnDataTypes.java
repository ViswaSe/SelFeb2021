package week1.day1;

public class LearnDataTypes {
	
	//Global variables:
	
	String mobileBrand = "One Plus";
	float price = 27899.99f;
	double phoneScreenSize = 15.6;
	boolean isSmartPhone = true;
	long phoneNum = 9578184957l;
	int modelNum = 8798;
	char osType = 'A';
	
	public static void main(String args[])
	{
		LearnDataTypes obj = new LearnDataTypes();
		
		System.out.println(obj.modelNum);
		System.out.println(obj.price);
		System.out.println(obj.phoneScreenSize);
		System.out.println(obj.phoneNum);
		System.out.println(obj.osType);
		
		//Local Variable:
		String mobile = obj.mobileBrand;
		System.out.println(mobile);
		
	}

}
