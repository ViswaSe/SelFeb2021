package weeklyassignments;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcel {
	
	@DataProvider(name="getData")
	public Object[][] readingValueFromExcel()
	{		
		XSSFWorkbook wb;
		XSSFSheet sheet;
		try 
		{
			//File file = new File(path);
			wb = new XSSFWorkbook("./data/ReadInput.xlsx");
			sheet = wb.getSheetAt(0);
			
			int rowSize = sheet.getPhysicalNumberOfRows();  // 2 (by neglecting your header row) 
			int cellSize = sheet.getRow(0).getLastCellNum(); //4
			
			Object[][] data = new Object[rowSize][cellSize];
			
			for(int i=1;i<rowSize;i++)
			{
				Row row = sheet.getRow(i);
				for(int j=0;j<cellSize;j++)  // 1-0,1-1,1-2,1-3 | 2-0,2-1,2-2,2-3
				{
					String text=row.getCell(j).getStringCellValue();
					if(text.equals(" "))
						data[i][j]="";
					else
						data[i][j]=text;
				}
			}
			
			return data;
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
		
	}

}
