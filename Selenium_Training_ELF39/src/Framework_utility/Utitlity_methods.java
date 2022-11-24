package Framework_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utitlity_methods extends Base_test  {
	// utility methods for send keys
			public static void Enter_Value_In_Textfield(WebElement element ,String value) {
				element.sendKeys(value);
			}
			
		// utility methods for click
			public static void Click_Element(WebElement element) {
				element.click();
			}
			
		// utitlity methods for dropdown
			public static void selectbyindex(WebElement element,int indexno) {
				Select select=new Select(element);
				select.selectByIndex(indexno);
			}
			
			public static void selectbyvisibletext(WebElement element,String text) {
				Select select=new Select(element);
				select.selectByVisibleText(text);
			}
			
			public static void selectbyvalue(WebElement element,String value) {
				Select select=new Select(element);
				select.selectByValue(value);
			}
			
//		 action class
			public static Actions actionclass(WebElement element) {
				Actions action=new Actions(driver);
				return action;
			}
			
			public static String Test_configuration()throws IOException{
			String filepath="./Test_configuration/TestConfiguration.properties";
			FileInputStream fis=new FileInputStream(filepath);

			Properties prop=new Properties();
			prop.load(fis);
		//	String url=prop.getProperty("URL");
			String url=prop.getProperty("link");
			return url;
			}
			
			
			public static Object[][] getTestData(String Sheetname) throws IOException {
				String filepath="./TestData/TestData.xlsx";
				FileInputStream fis =new FileInputStream(filepath);
				Workbook book=new XSSFWorkbook(fis);
				Sheet sheet=book.getSheet(Sheetname);
//				String value=sheet.getRow(1).getCell(1).getStringCellValue();
//				System.out.println(value);
				
				
				
				int row_count=sheet.getPhysicalNumberOfRows();
				int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
//				System.out.println(row_count);
//				System.out.println(col_count);
				Object[][] data=new Object[row_count-1][col_count];

				 


				for(int row=1;row<=row_count-1;row++) {

				for(int col=0;col<=col_count-1;col++) {
				data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
//				System.out.println(data[row][col]);
				//print all the rows and columns
				
					}
				}
				book.close();
				return data;
			}
			
				
			}

//				
//			}
			
	