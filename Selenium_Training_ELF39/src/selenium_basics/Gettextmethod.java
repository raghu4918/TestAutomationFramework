package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextmethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				
				String raaghu = driver.findElement(By.linkText("Wishlist")).getText();
				
System.out.println(raaghu);
 //String asdfg=driver.findElement(By.partialLinkText("ico")).getText();
 //System.out.println("asdfg");
}
}