package test_java;

import java.io.IOException;

import org.testng.annotations.Test;

import Ecommerce.pageobject.LandingPage;
import Ecommerce.pageobject.LoginPage;
import resources.BaseClass;

public class login2 extends BaseClass{
  @Test
  public void f() throws IOException, InterruptedException 
  {
	  driver=initialiseDriver();
		driver.get(prop.getProperty("baseurl"));
		LandingPage obj=new LandingPage(driver);
		Thread.sleep(1000);
		obj.getMyAcoountDropdown().click();
		obj.getLogin().click();
		Thread.sleep(1000);
		LoginPage obj2=new LoginPage(driver);
		obj2.getEmail().sendKeys(prop.getProperty("email"));
		obj2.getPassword().sendKeys(prop.getProperty("password"));
		
		obj2.getLoginButton().click();
  }
  
}
