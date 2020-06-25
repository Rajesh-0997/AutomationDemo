package AppiumPages;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BasePage 
{
	public static AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void SetUp()
	{
		try
		{
		DesiredCapabilities caps=new DesiredCapabilities();
		
		// Declaring android platform properties
		caps.setCapability("deviceName", "Mi A1");
        caps.setCapability("udid", "c622c8e00704"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.trello");
        caps.setCapability("appActivity","com.trello.home.HomeActivity");
        caps.setCapability("noReset","true");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
       driver =new AndroidDriver<MobileElement>(url, caps);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Application started.......");
	}
		catch(Exception e)
		{
			System.out.println("Cause is:"+e.getCause());
			System.out.println("Message is:"+e.getMessage());
			e.printStackTrace();		
		}
			
		}
	
	/*@AfterTest
	public void afterTest( )
	{
		driver.quit();
	}
	*/
	
	/*@Test
	public void SampleTest() 
	{
		System.out.println("I am in test ");
		
	}
	*/
	

}
