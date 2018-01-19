package generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib implements IAutoConstant
{
	public static Workbook wb;
	public static String getPropertyValue(String key)
	{
		String propertyValue="";
		Properties prop=new Properties();
		String cellValue="";
		try
		{
			prop.load(new FileInputStream("./config.properties"));
			propertyValue=prop.getProperty(key);
		}
		catch(Exception e)
		{
		}
		return propertyValue ;
	}
	public static String getCellValue(String sheet,String string, int column,int row)
	{
		String cellValue="";
		try
		{
			wb=WorkbookFactory.create(new FileInputStream("./testdata/data.xlsx"));
			//int cell;
			cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			
		}
		catch(Exception e)
		{
			
		}
		return cellValue;
	}
	public static int getRowCount(String EXCEL_PATH,String sheet )
	{
		int rowCount=0;
		try
		{
			wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH) );
			rowCount=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
	
	return rowCount;

}
	public static String getCellValue(String excelPath, String string, int i, int row) {
		// TODO Auto-generated method stub
		return null;
	}
}
