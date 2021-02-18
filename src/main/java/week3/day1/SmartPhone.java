package week3.day1;

public class SmartPhone extends AndroidMobile {

	public void connectWhatsApp()
	{
		System.out.println("Whats app application got connected");
	}


	public void takeVideo() 
	{
		System.out.println("Video is recording in smart phone"); 
	}


	public static void main(String args[])
	{
		SmartPhone obj = new SmartPhone();

		obj.sendMessage();
		obj.saveContact();
		obj.takePhoto();
		obj.takeVideo();
		obj.connectWhatsApp();
	}
}
