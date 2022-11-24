package selenium_basics.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectcardropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/M4NU/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo.html");
		driver.manage().window().maximize();
		WebElement select_cars=driver.findElement(By.id("standard_cars"));
		
		Select sel=new Select(select_cars);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByValue("min");
		Thread.sleep(1000);
		sel.selectByVisibleText("Volvo");
	}

}
