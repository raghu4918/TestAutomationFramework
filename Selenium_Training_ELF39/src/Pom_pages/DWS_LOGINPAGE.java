package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utitlity_methods;


public class DWS_LOGINPAGE extends Utitlity_methods {
	
	// constructor
	public DWS_LOGINPAGE(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	// WebElements
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement login_btn;
	
	// Methods
	public void Enter_email(String value) {
		//username.sendKeys(value);
		Utitlity_methods.Enter_Value_In_Textfield(username, value);
	}
	
	public void Enter_pswd(String value) {
		//password.sendKeys(value);
		Utitlity_methods.Enter_Value_In_Textfield(password, value);
	}
	public void click_login() {
		//login_btn.click();
		Utitlity_methods.Click_Element(login_btn);
	}
	
	
	
	
	}


