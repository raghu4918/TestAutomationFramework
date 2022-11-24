package test_cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;

public class Search_tc extends Base_test
{
@DataProvider(name="search")
	
	public Object testsearch() throws IOException{
		
		Object[][]data=Utitlity_methods.getTestData("search");
		
		//data[0][0]="computers";
		
		return data;
	}
	
	@Test(dataProvider="search")
	
	public void demo(String Title) {
		
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		Utitlity_methods.Enter_Value_In_Textfield(searchfield, Title);
		
		WebElement searchbtn=driver.findElement(By.xpath("//input[@value='Search']"));
		Utitlity_methods.Click_Element(searchbtn);
		
	
	}
}


