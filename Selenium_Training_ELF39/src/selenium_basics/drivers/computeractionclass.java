package selenium_basics.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class computeractionclass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
	//actions
	Actions action=new Actions(driver);
	action.moveToElement(element).build().perform();
	action.moveToElement(driver.findElement(By.xpath("(//a[@href='/desktops'])[1]"))).click().perform();	
	
}
}