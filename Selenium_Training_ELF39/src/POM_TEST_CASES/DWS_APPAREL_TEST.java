package POM_TEST_CASES;

 
	import java.io.IOException;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;
import Pom_pages.DWS_APPAREL_SHOES;

	import Pom_pages.DWS_HOMEPAGE;


	public class DWS_APPAREL_TEST extends Base_test {
		@DataProvider(name="appareltest")
		public Object[][] testdata() throws IOException {
			Object[][] data=Utitlity_methods.getTestData("apparel");
			return data;
		}
		
		@Test(dataProvider = "appareltest")
		public void tc05(String val1,String val2,String val3) {
			DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
			hp.click_apparel_shoes();
			
			DWS_APPAREL_SHOES ct=new DWS_APPAREL_SHOES(driver);
			ct.click_low_high(val1);
			ct.select_page(val2);
			ct.select_grid(val3);
		
	}


}
