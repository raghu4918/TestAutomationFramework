package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dms_css {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']")).sendKeys("computer");
				driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		
	}

}
