package seleniumdemos1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader
{
public static Object[][] readData() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Training_b6b.01.03\\Desktop\\Book1.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  int rowCount = sheet1.getPhysicalNumberOfRows();
	  XSSFRow row1 =sheet1.getRow(0);
	  int cellCount = row1.getPhysicalNumberOfCells();
	Object exceldata[][]=new Object[rowCount][cellCount];
	for(int i=0;i<rowCount;i++)
	  {
		  for(int j=0;j<cellCount;j++)
		  {
			  exceldata[i][j]=sheet1.getRow(i).getCell(j).getStringCellValue();
			  
		  }	  
	  }
	  return exceldata;
	
}
}
