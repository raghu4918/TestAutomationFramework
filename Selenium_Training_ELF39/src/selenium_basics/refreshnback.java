package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class refreshnback {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		//navigate
		driver.navigate().to("https://www.amazon.co.in");
		//driver.manage().window().maximize();
	
		//driver.navigate().forward();
	//	driver.navigate().refresh();
		//close
	//	driver.close();
		
	}

}
