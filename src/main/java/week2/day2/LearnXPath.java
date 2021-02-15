package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXPath {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://leaftaps.com/opentaps/control/main";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Aspire Systems");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Sathish");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Kaali");
		
		//select the last-1 option (Website from the source dropdown
		WebElement source=driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select dd_source=new Select(source);
		List<WebElement> allOptions=dd_source.getOptions();
		dd_source.selectByIndex(allOptions.size()-2);
		
		System.out.println(dd_source.getFirstSelectedOption().getText());
		
		//select the India text in the country drop down 
		WebElement country=driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']");
		Select dd_country=new Select(country);
		List<WebElement> allCountryOptions = dd_country.getOptions();
		for(WebElement eachCountry:allCountryOptions)
		{
			String countryName=eachCountry.getText();
			if(countryName.equals("India"))
			{
				dd_country.selectByVisibleText(countryName);
			}
		}
		
		System.out.println(dd_country.getFirstSelectedOption().getText());
		
		//select the tamilnadu state from the state dropdown using the select by value
		WebElement state = driver.findElementByXPath("//select[@id='createLeadForm_generalStateProvinceGeoId']");
		Select dd_state=new Select(state);
		List<WebElement> allStateOptions = dd_state.getOptions();
		for(WebElement eachState:allStateOptions)
		{
			String stateValue=eachState.getAttribute("value");
			if(stateValue.equals("IN-TN"))
			{
				dd_state.selectByValue(stateValue);
			}
		}
		
		System.out.println(dd_state.getFirstSelectedOption().getText());
		
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		//driver.quit();
	}
	
}
