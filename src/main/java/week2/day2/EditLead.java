package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://leaftaps.com/opentaps/control/main";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Sathish");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[contains(@class,'x-grid3-col-partyId')]/a)[1]").click();
		System.out.println(driver.getTitle());
		
		String newCompanyName="Ernst and Young";
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement eleCompanyName=driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
		eleCompanyName.clear();
		eleCompanyName.sendKeys(newCompanyName);
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
	
		String updatedCompName=driver.findElementById("viewLead_companyName_sp").getText();
		updatedCompName=updatedCompName.replaceAll("[^a-zA-z ]", "");
		updatedCompName=updatedCompName.trim();
		System.out.println(updatedCompName);
		
		if(newCompanyName.equals(updatedCompName))
		{
			System.out.println("Edit lead scenario completed successfully");
		}
		else
		{
			System.out.println("Changes are not done properly.");
		}
		
		driver.quit();
	}

}
