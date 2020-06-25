package com.ford.web.core;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseTest 
{
private WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() 
	{
	// driver=SampleTest.TestCase1();
	}
	
	/*@AfterMethod
	public void clean()
	{
		if(driver !=null)
			driver.quit();
	}*/
	
	protected WebDriver driver()
	{
		return driver;
	}

}
