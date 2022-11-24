package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Screen_shot_1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

driver.findElement(By.linkText("Register")).click();
   TakesScreenshot ts=(TakesScreenshot)driver;
   File ss=ts.getScreenshotAs(OutputType.FILE);
   

	}

}
