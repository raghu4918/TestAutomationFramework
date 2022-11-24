package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;
import Pom_pages.DWS_HOMEPAGE;
import Pom_pages.DWS_SEARCHPAGE;

public class DWS_SEARCH_TEST extends Base_test {
	@DataProvider(name="search")
	public Object[][] testdata1() throws IOException {
		Object[][] data=Utitlity_methods.getTestData("search");
		return data;
	}
	
	
	
	@Test(dataProvider = "search")
	public void TC03(String searchproduct) {
		DWS_SEARCHPAGE sp=new DWS_SEARCHPAGE(driver);
		sp.click_search_field(searchproduct);
		
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.click_search_btn();
		
		
		}
}
