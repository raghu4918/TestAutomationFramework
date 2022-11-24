package POM_TEST_CASES;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Pom_pages.DWS_HOMEPAGE;

public class DWS_SHOPCART_TEST extends Base_test{
	@Test
	public void TC11() {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.click_shopping_cart();
	}


}
