package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;
import Pom_pages.DWS_HOMEPAGE;
import Pom_pages.DWS_LOGINPAGE;


public class DWS_LOGIN_TEST extends Base_test {
	
	@DataProvider(name="loginpom")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utitlity_methods.getTestData("Login");
		return data;
	}
	
	
	@Test(dataProvider = "loginpom")
	public void TC01(String Email,String password) {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.Click_Login();
		
		DWS_LOGINPAGE lp=new DWS_LOGINPAGE(driver);
		lp.Enter_email(Email);
		lp.Enter_pswd(password);
		lp.click_login();
	}


}
