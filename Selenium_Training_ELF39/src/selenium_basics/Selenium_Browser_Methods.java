package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Browser_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//launch the chrome browser
	WebDriver driver=new ChromeDriver();
		
		//driver.get("www.google.co.in");
	//WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		
	}

	}

