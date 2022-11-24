package test_cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;

public class Advanc_search extends Base_test{
@DataProvider(name="advancesearch")
	
	public Object[]testadvancesearch() throws IOException{
		
		Object[][]data=Utitlity_methods.getTestData("Advance");
		
//		data[0][0]="Computers";
//		data[0][1]="Computers";
//		data[0][2]="Tricentis";
//		data[0][3]="1000";
//		data[0][4]="90000";
		
		return data;
	}
	@Test(dataProvider="advancesearch")
	
	public void demo(String txtfield,String category,String manufacturer,String start,String end) {
		
	WebElement searchbar=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	Utitlity_methods.Enter_Value_In_Textfield(searchbar, txtfield);
	
	WebElement clk=driver.findElement(By.xpath("//input[@value='Search']"));
	Utitlity_methods.Click_Element(clk);
	
	WebElement clk1=driver.findElement(By.xpath("//input[@id=\'As\']"));
	Utitlity_methods.Click_Element(clk1);
	
	WebElement drop=driver.findElement(By.id("Cid"));
	Utitlity_methods.selectbyvisibletext(drop,category);
	
	WebElement checkbox=driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
	Utitlity_methods.Click_Element(checkbox);
	
	WebElement mfr=driver.findElement(By.id("Mid"));
	Utitlity_methods.selectbyvisibletext(mfr, manufacturer);
		
	WebElement from=driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
	Utitlity_methods.Enter_Value_In_Textfield(from, start);
	
	WebElement to=driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));
	Utitlity_methods.Enter_Value_In_Textfield(to, end);
	
	WebElement click=driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
	Utitlity_methods.Click_Element(click);
		}
}


