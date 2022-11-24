package spotify;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;

public class Working_signup extends Base_test{ 
@DataProvider(name="login")
	
	public Object[]testlog() throws IOException{
	Object[][]data=Utitlity_methods.getTestData("spotify");
	return data;
}
		
	@Test(dataProvider="login")
	
public void signup(String email,String cemail,String pass,String name) {
	WebElement signup=driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
	Utitlity_methods.actionclass(signup, driver);
	
//	WebElement signup=driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
	Utitlity_methods.Click_Element(signup);
	
	WebElement mailtxtfield=driver.findElement(By.id("email"));
	Utitlity_methods.Enter_Value_In_Textfield(mailtxtfield, email);
	
	WebElement confrmmail=driver.findElement(By.id("confirm"));
	Utitlity_methods.Enter_Value_In_Textfield(confrmmail, cemail);
	
	WebElement pwd=driver.findElement(By.id("password"));
	Utitlity_methods.Enter_Value_In_Textfield(pwd, pass);

	WebElement pname=driver.findElement(By.id("displayname"));
	Utitlity_methods.Enter_Value_In_Textfield(pname, name);
}
 
}

