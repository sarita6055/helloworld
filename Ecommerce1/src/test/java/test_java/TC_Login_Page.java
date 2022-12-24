package test_java;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Ecommerce.pageobject.Edit_Acc_Info;
import Ecommerce.pageobject.LandingPage;
import Ecommerce.pageobject.LoginPage;
import resources.BaseClass;

public class TC_Login_Page extends BaseClass{
	
	//WebDriver driver;
	//Properties prop;
	@Test
	
	public void landinPage_test() throws IOException, InterruptedException
	{
	driver=initialiseDriver();
	driver.get(prop.getProperty("baseurl"));
	LandingPage obj=new LandingPage(driver);
	Thread.sleep(1000);
	obj.getMyAcoountDropdown().click();
	obj.getLogin().click();
	
	LoginPage obj2=new LoginPage(driver);
	obj2.getEmail().sendKeys(prop.getProperty("email"));
	obj2.getPassword().sendKeys(prop.getProperty("password"));
	obj2.getLoginButton().click();
	Thread.sleep(3000);
	Edit_Acc_Info obj3=new Edit_Acc_Info(driver);
	obj3.getEditAccInfo().click();
	
}
}