package selenium_basics.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("small-searchterms")).sendKeys("COMP");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[1]")).click();
		
		
	}
}
