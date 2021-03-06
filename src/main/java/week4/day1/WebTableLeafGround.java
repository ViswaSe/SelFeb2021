package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableLeafGround {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url="http://www.leafground.com/pages/table.html";
		driver.get(url);
		
		WebElement table = driver.findElementByXPath("//table[@id='table_id']");
		
		//Get the count of rows
		int rowSize=table.findElements(By.tagName("tr")).size();
		System.out.println("Row count: "+rowSize);
		
		//Get the count of columns
		int cellSize=table.findElement(By.tagName("tr")).findElements(By.tagName("th")).size();
		System.out.println("Column count: "+cellSize);
		
		//Get the progress of 'Learn to interact with elements' 
		String progress=driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[2]").getText();
		System.out.println(progress);
		
		//Check the vital task for least completed progress
		List<WebElement> allRows=table.findElements(By.tagName("tr"));
		
		int currentValue=100;int temp=0;
		
		for(int i=2;i<=allRows.size();i++)
		{
			List<WebElement> allCols=allRows.get(i-1).findElements(By.tagName("td"));
			String value=table.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td[2]")).getText();
			
			int val = Integer.parseInt(value.replaceAll("\\D", ""));
			
			if(val<currentValue)
			{
				currentValue=val;
				temp=i;
			}
			
		}
		
		System.out.println("Least percentage value is: "+currentValue);
		System.out.println("Vital task checked row number is: "+temp);
		
		table.findElement(By.xpath("//table[@id='table_id']//tr["+temp+"]/td[3]/input")).click();

	}

}
