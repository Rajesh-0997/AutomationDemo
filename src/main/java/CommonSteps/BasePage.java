package CommonSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BasePage
{
	protected static WebDriver driver;
	
	@BeforeMethod
	public void BrowserSetup()
	{
		System.setProperty("webdriver.gecko.driver", "driver path name");
	   	 driver=new FirefoxDriver();//launch firefox
	   	  	
	}

}
