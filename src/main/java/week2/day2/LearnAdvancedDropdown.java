package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAdvancedDropdown {

		public static void main(String args[])
		{
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			String url="http://leaftaps.com/opentaps/control/main";
			driver.get(url);
			
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByPartialLinkText("CRM").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Create Lead").click();
			
			//Select the last-1 option (Website) from the source dropdown
			WebElement source=driver.findElementById("createLeadForm_dataSourceId");
			Select dd_source=new Select(source);
			
			List<WebElement> allOptions=dd_source.getOptions();
			int source_size=allOptions.size();
			System.out.println("source dropdown option size:" +source_size);
			dd_source.selectByIndex(source_size-2);
			
			//print the selected option in source dropdown
			System.out.println(dd_source.getFirstSelectedOption().getText());
			
			//select the last option text matching (Road and Track) from market campaign dropdown
			WebElement marketCampaign=driver.findElementById("createLeadForm_marketingCampaignId");
			Select dd_marketCampaign = new Select(marketCampaign);
			
			List<WebElement> allMarketCampaign=dd_marketCampaign.getOptions();
			int marketCampaign_size=allMarketCampaign.size();
			System.out.println("Market Campaign dropdown size: "+marketCampaign_size);
			
			for(int i=0;i<marketCampaign_size;i++)
			{
				if(allMarketCampaign.get(i).getText().equals("Road and Track"))
				{
					dd_marketCampaign.selectByIndex(i);
				}
			}
			
			//print the market campaign dropdown selected value
			System.out.println(dd_marketCampaign.getFirstSelectedOption().getText());
		}
}
