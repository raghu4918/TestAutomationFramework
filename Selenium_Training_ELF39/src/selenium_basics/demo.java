package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) {
		
	
	System.setProperty("\"webdriver.chrome.driver\", \"./drivers/chromedriver_win32/chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("cusid")).sendKeys("raghu123");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(3000);
	//Switching the alert
	Alert ale=driver.switchTo().alert();
	//handling the alert
	
	Thread.sleep(3000);
	ale.accept();
	
	driver.close();


}
