package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;

public class DWS_MULTIPLEHANDLE_PAGE extends Base_test {
	public DWS_MULTIPLEHANDLE_PAGE (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
// webElement
	@FindBy(xpath="//input[@name='email']")
	WebElement mail; 
	
	@FindBy(xpath="//input[@name='pass']")
	WebElement password;

	@FindBy(xpath="(//span[text()='Log in'])[1]")
	WebElement click_fb_btn;
	
	
	
	
	// Methods
	public void Click_mail(String email) {
		Utitlity_methods.Enter_Value_In_Textfield(mail,email);
	}
	public void Click_password_fb(String pwd) {
		Utitlity_methods.Enter_Value_In_Textfield(password, pwd);
	}
	public void Click_btn_ffb() {
		Utitlity_methods.Click_Element(click_fb_btn);
	}

}
