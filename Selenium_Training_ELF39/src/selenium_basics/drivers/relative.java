package selenium_basics.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	driver.findElement(By.xpath("//input[@name='Gender']")).click();
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("raghu");
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("kashyap");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Raghuuuuu1234444@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("raghu@689");
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("raghu@689");
	driver.findElement(By.xpath("//input[@id='register-button']")).click();


	
}
}