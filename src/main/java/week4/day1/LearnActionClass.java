package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActionClass {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url="http://www.leafground.com/pages/selectable.html";
		driver.get(url);
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		
		/*Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).clickAndHold(item1).release(item4).
		keyUp(Keys.CONTROL).perform();
		*/
		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item1).click(item2)
		.click(item3).click(item4).keyUp(Keys.CONTROL).keyUp(Keys.CONTROL).perform();
		
	}
	
}
