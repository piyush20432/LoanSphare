package generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib {
	
	public static String getPropertyValue(String key) {
		String propertyValue="";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("./config.properties"));
			propertyValue = prop.getProperty(key);
		} catch(Exception e) {
			
		}
		return propertyValue;
	}

public static String getCellValue(String sheet, int row,int column)
{
	String cellValue="";
	try {
		FileInputStream fis =new FileInputStream("./testdata/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		cellValue=wb.getSheet(sheet).getRow(row).getCell(column).toString();
		
	} catch (Exception e) {
	
	}
	return cellValue;
	
	}

}
