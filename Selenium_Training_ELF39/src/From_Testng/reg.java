package From_Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class reg {
	WebDriver driver;
	@BeforeTest
	public void browser_setup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void register() {
		
		driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys("raghu");
			driver.findElement(By.id("LastName")).sendKeys("kashyap");
			driver.findElement(By.name("Email")).sendKeys("raghu01@gmail.com");
				driver.findElement(By.cssSelector("input[class='text-box single-line password']")).sendKeys("raghu@123");
				driver.findElement(By.id("ConfirmPassword")).sendKeys("raghu@123");
				driver.findElement(By.id("register-button")).click();
	}
	@AfterTest
	public void close() {
						driver.close();
	}}


