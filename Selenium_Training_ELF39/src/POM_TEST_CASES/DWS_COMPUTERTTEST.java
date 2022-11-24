package POM_TEST_CASES;


	import java.io.IOException;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;
import Pom_pages.DWS_COMPUTERPAGE;
	import Pom_pages.DWS_HOMEPAGE;


	public class DWS_COMPUTERTTEST extends Base_test {
		@DataProvider(name="comppom")
		public Object[][] testdata() throws IOException {
			Object[][] data=Utitlity_methods.getTestData("computer");
			return data;
		}
		
		@Test(dataProvider = "comppom")
		public void tc05(String val1,String val2,String val3) {
			DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
			hp.Mouse_hover_comp();
			
			DWS_COMPUTERPAGE ct=new DWS_COMPUTERPAGE(driver);
			ct.click_low_high(val1);
			ct.select_page(val2);
			ct.select_grid(val3);
		
	}

}
