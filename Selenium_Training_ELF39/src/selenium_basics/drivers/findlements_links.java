package selenium_basics.drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findlements_links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement>link=driver.findElements(By.xpath("//a"));
		int c=0;
		for(int i=0;i<=link.size()-1;i++) {
			c++;
			System.out.println(link.get(i).getText());
		}
		System.out.println("total"+c);
		

}
}