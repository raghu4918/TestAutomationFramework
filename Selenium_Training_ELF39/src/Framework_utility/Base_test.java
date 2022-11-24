package Framework_utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Base_test {
	
	public static WebDriver driver;
	 
	@BeforeClass
	public void browser_setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	    driver=new ChromeDriver();
	//	driver.get("https://demowebshop.tricentis.com/");
	    String url=Utitlity_methods.Test_configuration();
	    driver.get(url);
		driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
}
	
//	@AfterClass
//	public void exit() {
//	driver.close();
//	}
	
}