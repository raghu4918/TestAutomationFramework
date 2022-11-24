import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Advance_search {
@Test
	
	public void Dws() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("small-searchterms")).sendKeys("Short");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	driver.findElement(By.id("As")).click();
	
	WebElement drop=driver.findElement(By.id("Cid"));
	Select down=new Select(drop);
	down.selectByVisibleText("Jewelry");
	
	Thread.sleep(3000);
	
	WebElement drop1=driver.findElement(By.id("Mid"));
	Select down1=new Select(drop);
	down1.selectByVisibleText("Tricentis");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	
}

}
