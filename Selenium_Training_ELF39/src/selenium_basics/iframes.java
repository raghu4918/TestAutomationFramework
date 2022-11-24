package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/M4NU/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/iframe.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		// Identify the frame n switch to it
		// switch frame by index
		
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
//driver.switchTo().frame("FR1");
		
	//	driver.findElement(By.id("small-searchterms")).sendKeys("Books");
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
				
	}
}