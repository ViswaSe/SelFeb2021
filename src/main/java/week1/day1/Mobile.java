package week1.day1;

public class Mobile {
	
	public void sendSms()
	{
		System.out.println("Sms sent successfully");
	}
	
	public void makeCall()
	{
		System.out.println("Call got connected");
	}
	
	public static void main(String args[])
	{
		Mobile obj = new Mobile();
		
		obj.sendSms();
		obj.makeCall();
	}

}
