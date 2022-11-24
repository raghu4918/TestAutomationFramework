package test_cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;
import selenium_basics.utilitymethods;

public class register_tc extends Base_test {
	
	@DataProvider(name="register")
	public Object[]testdata() throws IOException{
		
		Object[][]data=Utitlity_methods.getTestData("register");
		
//		data [0][0]="raghu";
//		data [0][1]="kashyap";
//		data [0][2]="raghu004@gmail.com";
//		data [0][3]="Raghu#123";
//		data [0][4]="Raghu#123";
//		
		return data;
	}
	
	@Test(dataProvider="register")	
	public void demo(String FN,String LN,String mailid,String pwd,String Cpwd ) {
		
		WebElement reg_click=driver.findElement(By.xpath("//a[text()='Register']"));
		Utitlity_methods.Click_Element(reg_click);
		
		WebElement fn=driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
		Utitlity_methods.Enter_Value_In_Textfield(fn,FN);
		
		WebElement ln=driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
		Utitlity_methods.Enter_Value_In_Textfield(ln, LN);
		
		WebElement email=driver.findElement(By.xpath("//input[@name=\"Email\"]"));
		Utitlity_methods.Enter_Value_In_Textfield(email, mailid);
		
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Utitlity_methods.Enter_Value_In_Textfield(pass, pwd);
		
		WebElement cnpass=driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
		Utitlity_methods.Enter_Value_In_Textfield(cnpass, Cpwd);
		
		WebElement regbutton=driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
		Utitlity_methods.Click_Element(regbutton);
		
		WebElement confrm=driver.findElement(By.xpath("//input[@type=\"button\"][1]"));
		Utitlity_methods.Click_Element(confrm);
		
	}
}

	
	