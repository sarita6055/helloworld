package test_java;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Ecommerce.pageobject.flipkart;
import resources.BaseClass;

public class TC_FlipkartTest extends BaseClass {
	WebDriver driver;


  @Test
  public void flip_login_tcTest() throws IOException {
		
	
		
			driver=initialiseDriver();
			driver.get(prop.getProperty("baseurl1"));
			flipkart obj=new flipkart(driver);
			//obj.getLoginFlipkart().click();
		}
  @AfterMethod
  public void closing_browser()
  {
	  driver.close();
  }
  
  
  
  
}
