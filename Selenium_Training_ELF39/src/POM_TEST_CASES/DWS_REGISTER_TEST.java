package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;
import Pom_pages.DWS_HOMEPAGE;
import Pom_pages.DWS_REGISTERPAGE;


public class DWS_REGISTER_TEST extends Base_test {
	@DataProvider(name="registerpom")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utitlity_methods.getTestData("Register");
		return data;
	}
	
	
	
	@Test(dataProvider = "registerpom")
	public void TC02(String fname,String lname,String Email,String password,String Cpassword) {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.Click_register();
		
		DWS_REGISTERPAGE rt=new DWS_REGISTERPAGE(driver);
		rt.click_male();
		rt.enter_first_name(fname);
		rt.enter_last_name(lname);
		rt.enter_mail(Email);
		rt.enter_pswd(password);
		rt.enter_Confirm_pswd(Cpassword);
		rt.Click_reg_btn();

}

}
