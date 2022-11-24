package selenium_basics.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsendkeys{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Actions click=new Actions(driver);
		click.sendKeys(search,"computer").perform();
		Thread.sleep(3000);
		click.sendKeys(Keys.PAGE_DOWN).perform();
	}}
		  