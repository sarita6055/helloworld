package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
public	Properties prop;
	//@BeforeClass
public WebDriver initialiseDriver() throws IOException
{
	prop=new Properties();
	String path=System.getProperty("user.dir") + "\\src\\main\\java\\resources\\resources.configp\\config";
	
	FileInputStream fis=new FileInputStream(path);
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		}
	else if(browserName.equalsIgnoreCase("Edge"))
	{
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver;
}
	public String takeScreenshot(String testName, WebDriver driver) throws IOException
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String d=System.getProperty("user.dir")+"\\Screenshot\\"+testName+".png";
		FileUtils.copyFile(s, new File(d));
		return d;
	}
}
	

