package week1.day2;

import week1.day1.Mobile;

public class OwnMobile {
	
	public void playSongs()
	{
		System.out.println("Songs are playing in your mobile");
	}
	
	public void changeSong(String songName)
	{
		System.out.println(songName+ " is playing now.");
	}
	
	public static void main(String args[])
	{
		Mobile mobile = new Mobile();
		mobile.sendSms();  // calling the differnt package different class method with the help of import statemnt
		
		OwnMobile om = new OwnMobile();
		om.playSongs(); // calling the same class method with the help of object
		
		MyMobile mm = new MyMobile();
		mm.changeScreenLock(); // calling the different class method with the help of object
		
		om.changeSong("Vaathi coming"); //passing the argument to the method
	}

}
