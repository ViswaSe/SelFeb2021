package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryUI {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url="https://jqueryui.com/selectable/";
		driver.get(url);
		
		WebElement eleFrame = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(eleFrame);
		
		Actions builder = new Actions(driver);
		
		WebElement eleItem1=driver.findElementByXPath("//li[text()='Item 1']");
		WebElement eleItem2=driver.findElementByXPath("//li[text()='Item 2']");
		WebElement eleItem3=driver.findElementByXPath("//li[text()='Item 3']");
		WebElement eleItem5=driver.findElementByXPath("//li[text()='Item 5']");
		WebElement eleItem7=driver.findElementByXPath("//li[text()='Item 7']");
		
		builder.moveToElement(eleItem1).click(eleItem1).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",eleItem3);
		
		builder.keyDown(Keys.CONTROL)
		.pause(3000)
		.click(eleItem3).click(eleItem5).click(eleItem7).keyUp(Keys.CONTROL).perform();
		
	}

}
