package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		String url="http://www.leafground.com/pages/Dropdown.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElementById("dropdown1");
		Select dd = new Select(dropdown);
		dd.selectByValue("1");
			
	}
}
