package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utitlity_methods;


public class DWS_SEARCHPAGE extends Utitlity_methods{
	//constructor-to initialize the driver instance and WebElements
	public DWS_SEARCHPAGE(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//webElements
	@FindBy(xpath="//input[@id='small-searchterms']")
    WebElement search;   // search field
	

// Methods
	 public void click_search_field(String value) {
		  // search.click();
		   Utitlity_methods.Enter_Value_In_Textfield(search, value);
	   }
   
   
   
   
   
   
}


