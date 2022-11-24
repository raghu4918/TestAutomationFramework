package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utitlity_methods;

public class DWS_JEWELARYPAGE {
	// constructor
				public DWS_JEWELARYPAGE(WebDriver driver) {
					PageFactory.initElements(driver,this);
				}

				// WebElements 
				
				@FindBy(xpath="//select[@id='products-orderby']")
				WebElement low_h;
				
				@FindBy(xpath="//select[@id='products-pagesize']")
				WebElement sel;
				
				@FindBy(xpath="//select[@id='products-viewmode']")
				WebElement sel_v;
				
				
				
				// Methods
				public void click_low_high(String value) {
					Utitlity_methods.selectbyvisibletext(low_h, value);
				}
				
				public void select_page(String value) {
					Utitlity_methods.selectbyvisibletext(sel, value);
				}
				
				public void select_grid(String value) {
					Utitlity_methods.selectbyvisibletext(sel_v, value);
				}
				
				

}
