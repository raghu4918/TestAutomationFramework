package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;

public class mouse_hover extends Base_test {
@Test()
	
	public void demo() {
		
	Actions action=new Actions(driver);
	
	WebElement mouse_hover=driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
	
	action.moveToElement(mouse_hover).build().perform();
	
	WebElement button=driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]"));
	Utitlity_methods.Click_Element(button);
		
	}
}



