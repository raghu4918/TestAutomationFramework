package test_cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;
import selenium_basics.utilitymethods;

public class login_tc extends Base_test{
@DataProvider(name="login")
	
	public Object[]testlog() throws IOException{
		Object[][]data=Utitlity_methods.getTestData("Login");
		//data [0][0]="raghu003@gmail.com";
		//data [0][1]="kashyap#123";
		
		return data;
	}
	@Test(dataProvider="login")
	public void login(String mailid,String pwd) {
		WebElement login_click=driver.findElement(By.className("ico-login"));
		// Click_Element(login_link)
		Utitlity_methods.Click_Element(login_click);
		
		//driver.findElement(By.id("Email")).sendKeys("");
		WebElement username=driver.findElement(By.id("Email"));
		//Enter_Value_In_Textfield(username, "");
		Utitlity_methods.Enter_Value_In_Textfield(username, mailid);
		
		//driver.findElement(By.id("Password")).sendKeys("Raj#123");
		WebElement passwrd=driver.findElement(By.id("Password"));
		//Enter_Value_In_Textfield(passwrd, "Raj#123");
		Utitlity_methods.Enter_Value_In_Textfield(passwrd, pwd);
		
		WebElement submit=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
		Utitlity_methods.Click_Element(submit);
		}
	}

	


