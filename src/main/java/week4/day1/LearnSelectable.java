package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectable {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url="http://www.leafground.com/pages/selectable.html";
		driver.get(url);
		
		WebElement eleItem1=driver.findElementByXPath("//li[text()='Item 1']");
		WebElement eleItem3=driver.findElementByXPath("//li[text()='Item 3']");
		WebElement eleItem5=driver.findElementByXPath("//li[text()='Item 5']");
		WebElement eleItem7=driver.findElementByXPath("//li[text()='Item 7']");
	
		Actions builder = new Actions(driver);
		builder.click(eleItem1).keyDown(Keys.CONTROL).click(eleItem3)
		.click(eleItem5).click(eleItem7).perform();
		
	}

}
