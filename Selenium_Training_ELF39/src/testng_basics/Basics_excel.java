package testng_basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Basics_excel {
	
@Test 
public void exceldemo() throws IOException {
	String filepath="./TestData/TestData.xlsx";
	FileInputStream fis =new FileInputStream(filepath);
	Workbook book=new XSSFWorkbook(fis);
	Sheet sheet=book.getSheet("Sheet1");
//	String value=sheet.getRow(1).getCell(1).getStringCellValue();
//	System.out.println(value);
	
	
	
	int row_count=sheet.getPhysicalNumberOfRows();
	int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println(row_count);
	System.out.println(col_count);
	Object[][] data=new Object[row_count][col_count];

	 


	for(int row=1;row<row_count-1;row++) {

	for(int col=0;col<col_count-1;col++) {
	data[row][col]=sheet.getRow(row).getCell(col).getStringCellValue();
//	System.out.println(data[row][col]);
	//print all the rows and columns
	
		}
	}
	for(int i=0;i<=data.length;i++) {
		for(int j=0;j<data [i].length;j++) {
			System.out.println(data[i][j]);
		}
	}
}
}
