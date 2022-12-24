package Ecommerce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{this.driver=driver;
		PageFactory.initElements(driver, this);//oops method overloading
		
	}
		@FindBy(xpath="//input[@id='input-email']")
		private WebElement email;
		
		@FindBy(xpath="//input[@id='input-password']")
		private WebElement password;
		
		@FindBy(xpath="//input[@class='btn btn-primary']")
		private WebElement LoginButton;
		
		public WebElement getEmail() {
			return email;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getLoginButton() {
			return LoginButton;
		}
	

}
