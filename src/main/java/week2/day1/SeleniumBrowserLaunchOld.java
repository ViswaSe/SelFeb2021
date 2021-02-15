package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowserLaunchOld {
	
	public static void main(String args[])
	{
		//Launch the leaftaps site
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Launch the url
		String url="http://leaftaps.com/opentaps/control/main";
		driver.get(url);
	}

}
