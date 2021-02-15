package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBrowserLaunchNew {
	
	public static void main(String args[])
	{
		//Setup the chrome driver with respect to the browser version with the help of webdrivermanager in bonigarcia
		WebDriverManager.chromedriver().setup();
		
		//Open the chrome browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();
		
		//load the application url  
		String url="http://leaftaps.com/opentaps/control/main";
		driver.get(url);
		
		//close the browser
		driver.quit();
				
	}

}
