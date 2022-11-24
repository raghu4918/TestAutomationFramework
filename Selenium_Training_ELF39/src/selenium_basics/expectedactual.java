package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class expectedactual {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(c);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Raghu");
		driver.findElement(By.id("LastName")).sendKeys("M");
		driver.findElement(By.id("Email")).sendKeys("raghu1233@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456789asdf");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789asdf");
		driver.findElement(By.id("register-button")).click();
		
		
		
		String expected="Your registration completed";
		String actual=driver.findElement(By.className("result")).getText();
		System.out.println(actual);
		
		if(actual.equalsIgnoreCase(expected)) {
			System.out.println("successful");
		}
			else {
				System.out.println("noooooo");
			}
		}
			}


	