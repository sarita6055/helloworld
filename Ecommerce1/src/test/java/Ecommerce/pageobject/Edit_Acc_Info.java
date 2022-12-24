package Ecommerce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Acc_Info {
	WebDriver driver;
	public Edit_Acc_Info(WebDriver driver)
	{this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//a[text()='Edit your account information']")
private WebElement EditAccInfo;

public WebElement getEditAccInfo() {
	return EditAccInfo;
}
}
