package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAdvancedXPath2 {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		String url = "http://leaftaps.com/opentaps/control/main";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		//Findout the from and to icon through xpath in merge leads page
		
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]");
		String fromLead=driver.findElementByXPath("(//img[@alt='Lookup'])[1]/ancestor::td/preceding-sibling::td/span[1]").getText();
		System.out.println(fromLead);
	
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]");
		String toLead=driver.findElementByXPath("(//img[@alt='Lookup'])[2]/ancestor::td/preceding-sibling::td/span[1]").getText();
		System.out.println(toLead);
	}

}
