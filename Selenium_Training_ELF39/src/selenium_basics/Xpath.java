package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/M4NU/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/xpath1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("raghu");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("kashyap");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("TYSS");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("BENGALURU");
		
		

}
}