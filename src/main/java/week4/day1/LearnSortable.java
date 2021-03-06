package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSortable {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url="http://www.leafground.com/pages/sortable.html";
		driver.get(url);
		
		WebElement item1=driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item5=driver.findElementByXPath("//li[text()='Item 5']");
	
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).moveToElement(item5).moveByOffset(0,10)
		.release(item1).perform();
		
	
	}
}
