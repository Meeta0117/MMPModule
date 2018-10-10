package org.h2k.MMP.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

// In BaseClass we need to put all information about browser only. If we want to use this framework again we need to change only testng.xml file only
 //why we use protected as modifier be' we don't want anybody to access this class
	
	
	public WebDriver driver;
	@Parameters({"browserType"})
	@BeforeTest
	protected void getDriverInstance(String browserType) {
		System.out.println("in getDriverInstance");
		
		if (browserType.equals("IE")) 
		{
			driver= new InternetExplorerDriver();
		}
		else if (browserType.equals("CH"))
		{
			driver=new ChromeDriver();
		}
		else 
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		
	}
	
	
	
	
}


