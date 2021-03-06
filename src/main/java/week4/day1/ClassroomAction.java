package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomAction {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url="https://www.snapdeal.com/";
		driver.get(url);
		
		WebElement eleMensFashion=driver.findElementByXPath("//li[text()='More Categories']/following::span[1]");
		WebElement eleShirts = driver.findElementByXPath("(//span[text()='Shirts'])[2]");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(eleMensFashion).click(eleShirts).perform();
		
		WebElement eleFirstShirt=driver.findElementByXPath("(//section[contains(@class,'dp-fired')])[1]/div[1]//picture");
		builder.moveToElement(eleFirstShirt).perform();
		
		WebElement eleQuickView = driver.findElementByXPath("(//div[contains(text(),'Quick View')])[1]");
		builder.click(eleQuickView).perform();
		
	}

}
