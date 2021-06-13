package weeklyassignments;

import org.testng.annotations.Test;

public class ReadingExcel extends ReadExcel{
	
	@Test(dataProvider="getData")
	public void getExcelValue(String username,String password,String ownHouse,String rentalHouse)
	{
		System.out.println(username+" "+password+" "+ownHouse+" "+rentalHouse);
	}

}
