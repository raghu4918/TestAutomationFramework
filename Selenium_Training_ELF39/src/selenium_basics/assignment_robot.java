package selenium_basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_robot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/M4NU/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo%20(2).html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement choosefile_button=driver.findElement(By.id("resume"));
		Actions action=new Actions(driver);
		action.moveToElement(choosefile_button).click().perform();

		Thread.sleep(2000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);

		for(int i=0;i<=2;i++) {
		robot.keyPress(KeyEvent.VK_TAB);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
	

}
}