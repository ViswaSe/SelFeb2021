package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningSelenium {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		String url = "http://103.224.241.244:8085/BHDS/Dashboard";
		String username="TESTING";
		String password="Bornfire@123";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElementById("userid").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByXPath("//button[text()='Sign in']").click();
		
		clickUsingJavaScript("id", "admin", driver);
		sleep();
		clickUsingJavaScript("id","UserProfile", driver);
		sleep();
		clickUsingJavaScript("id","admin", driver);
		sleep();
		clickUsingJavaScript("id", "Projectmaster", driver);
		sleep();
		clickUsingJavaScript("id", "admin", driver);
		sleep();
		clickUsingJavaScript("id", "BHDSNotificationList", driver);
		sleep();
		clickUsingJavaScript("id", "monitoring", driver);
		sleep();
		clickUsingJavaScript("id", "BHDSClientIssueLog", driver);
		sleep();
		clickUsingJavaScript("id", "Troubleshooting", driver);
		sleep();
		
	}
	
	public static void sleep() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	public static void clickUsingJavaScript(String locatorType,String locator,ChromeDriver driver)
	{
		WebElement ele = null;
		switch(locatorType)
		{
		case "id" : 
			ele=driver.findElementById(locator);break;
			
		case "xpath":
			ele=driver.findElementByXPath(locator);break;
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
	}
}
