package selenium_basics;

import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class screenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

driver.findElement(By.linkText("Register")).click();
   TakesScreenshot ts=(TakesScreenshot)driver;
   File home_page=ts.getScreenshotAs(OutputType.FILE);



	}

}
