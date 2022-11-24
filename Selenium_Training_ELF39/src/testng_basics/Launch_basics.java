package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_basics {
@Test
public void demo() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
//driver.findElement(By.id("small-searchterms")).sendKeys("Books");
//driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.linkText("Register")).click();
/*driver.findElement(By.id("gender-male")).click();
driver.findElement(By.id("FirstName")).sendKeys("raghu");
driver.findElement(By.id("LastName")).sendKeys("kashyap");
driver.findElement(By.id("Email")).sendKeys("asdf1223@gmail.com");
driver.findElement(By.id("Password")).sendKeys("lkjh123");
driver.findElement(By.id("ConfirmPassword")).sendKeys("lkjh123");
driver.findElement(By.id("register-button")).click();*/
	driver.findElement(By.partialLinkText("Log")).click();
	driver.findElement(By.id("Email")).sendKeys("asdf1223@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("lkjh123");
	driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
	
	
	
	
}
}
