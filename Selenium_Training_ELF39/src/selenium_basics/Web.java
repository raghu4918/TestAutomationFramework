package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https:demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	// create object of webdriverwait
		WebDriverWait wait=new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='gender-male']"))));
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("raghu");
		
		driver.findElement(By.id("LastName")).sendKeys("kashyap");

		driver.findElement(By.name("email")).sendKeys("raghu12345@gmail.com");
		
		driver.findElement(By.cssSelector("input[class='text-box single-line password']")).sendKeys("raghu#123");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("raghu#123");
		
		driver.findElement(By.id("register-button")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(by.)))
	
	
}
}
