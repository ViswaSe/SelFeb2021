package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadWithDropdown {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String url="http://leaftaps.com/opentaps/control/main";
		driver.get(url);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("AspireSystems");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sathish");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kaali");
		
		//selectByVisibleText
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd_ownership = new Select(ownership);
		dd_ownership.selectByVisibleText("Partnership");
		
		//selectByValue
		WebElement dataSourceId=driver.findElementById("createLeadForm_dataSourceId");
		Select dd_dataSourceId=new Select(dataSourceId);
		dd_dataSourceId.selectByValue("LEAD_CONFERENCE");
		
		//selectByIndex
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd_marketCampaign = new Select(marketingCampaign);
		dd_marketCampaign.selectByIndex(1);
		
		driver.findElementByClassName("smallSubmit").click();
		
	}

}
