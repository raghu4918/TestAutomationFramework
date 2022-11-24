package selenium_basics.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assigndoubleclick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	//WebElement db1_click=driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		
		WebElement right=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions action=new Actions(driver);
		action.contextClick(right).build().perform();
		

}
}