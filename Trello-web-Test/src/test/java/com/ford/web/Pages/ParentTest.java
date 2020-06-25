package com.ford.web.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class ParentTest
{
	private WebDriver driver;
	@BeforeMethod
	public void testcase()
	{

	 	  System.setProperty("webdriver.gecko.driver", "/home/qapitol/Downloads/SeleniumTools+Jars/geckodriver");
	 	   driver=new FirefoxDriver();
	}
	
	/*@AfterMethod
	public void cleanup()
	{
		if(driver!=null)
			driver.quit();
	}
*/
	protected WebDriver driver()
	{
		return driver;
		
	}
}
