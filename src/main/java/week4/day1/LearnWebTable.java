package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url="https://erail.in/";
		driver.get(url);
		driver.findElementById("chkSelectDateOnly").click();
		
		String fromStation = "MS";
		String toStation = "MDU";
		
		Thread.sleep(3000);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys(fromStation,Keys.TAB);
		
		Thread.sleep(2000);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys(toStation,Keys.TAB);
		
		WebElement table=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		List<WebElement> allRows=table.findElements(By.tagName("tr"));
		List<String> allTrains = new ArrayList<String>();
		
		for(int i=1;i<=allRows.size();i++)
		{
			String text=table.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();	
			allTrains.add(text);
		}
		
		Set<String> uniqueTrains = new LinkedHashSet<String>();
		uniqueTrains.addAll(allTrains);
		
		System.out.println(allTrains);
		System.out.println(uniqueTrains);
		
		System.out.println("Number of Trains repeating are: "+(allTrains.size()-uniqueTrains.size()));
	}

}
