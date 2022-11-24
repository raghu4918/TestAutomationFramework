package selenium_basics.drivers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class multiplewindowhandlings {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	String parent_window=driver.getWindowHandle();
	System.out.println(parent_window);
    // Set<String>total_windows=driver.getWindowHandles();
	//System.out.println(total_windows);
	//if( driver.getTitle().equalsIgnoreCase("")
		
	
	
	
}
}
