package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignhandling123 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/M4NU/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/MultipleWindow.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(5000);
		Set<String>total=driver.getWindowHandles();
		System.out.println(total);
		for(String tot:total) {
			driver.switchTo().window(tot);
			String title=driver.getTitle();
			System.out.println(title);
	if(title.equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food")) {
				Thread.sleep(2000);
				driver.close();
	}
}
	} 
}
