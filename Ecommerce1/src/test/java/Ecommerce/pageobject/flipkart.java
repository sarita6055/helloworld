package Ecommerce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart {
	WebDriver driver;
	public flipkart (WebDriver driver)
	{
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Login']")
	private WebElement LoginFlipkart;
	
	public WebElement getLoginFlipkart() {
		return LoginFlipkart;
	}
	

}
