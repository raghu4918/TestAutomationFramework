package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utitlity_methods;


public class DWS_REGISTERPAGE extends Utitlity_methods{
	//constructor-to initialize the driver instance and WebElements
	
		public DWS_REGISTERPAGE(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		// WebElements
        @FindBy(css="input[id='gender-male']")
        WebElement male_radio_btn;
        
        @FindBy(xpath="//input[@id='FirstName']")
        WebElement first_name ;
        
        @FindBy(xpath="//input[@id='LastName']")
         WebElement last_name ;
        
        @FindBy(xpath="//input[@id='Email']")
        WebElement email ;
        
        @FindBy(xpath="//input[@id='Password']")
        WebElement password ;
        
        @FindBy(xpath="//input[@id='ConfirmPassword']")
        WebElement confirm_password ;
        
        @FindBy(xpath="//input[@id='register-button']")
        WebElement reg_btn ;
        
        
        
        // Methods 
        public void click_male() {
        	//male_radio_btn.click();
        	Utitlity_methods.Click_Element(male_radio_btn);
        }
        
        public void enter_first_name(String value) {
        	//first_name.sendKeys(value);
        	Utitlity_methods.Enter_Value_In_Textfield(first_name, value);
        }
        
        public void enter_last_name(String value) {
        	//last_name.sendKeys(value);
        	Utitlity_methods.Enter_Value_In_Textfield(last_name, value);
        }
        
        public void enter_mail(String value) {
        	//email.sendKeys(value);
        	Utitlity_methods.Enter_Value_In_Textfield(email, value);
        }
        public void enter_pswd(String value) {
        	//password.sendKeys(value);
        	Utitlity_methods.Enter_Value_In_Textfield(password, value);
        }
        public void enter_Confirm_pswd(String value) {
        	//confirm_password.sendKeys(value);
        	Utitlity_methods.Enter_Value_In_Textfield(confirm_password, value);
        }
        
        public void Click_reg_btn() {
        	//reg_btn.click();
        	Utitlity_methods.Click_Element(reg_btn);
        }
        
        
        
        
        
        
        
        
        
        
        
        
}



