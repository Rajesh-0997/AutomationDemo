import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.tools.ant.Main;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class EmulatorBasePage 
{
	
	//public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	public static void main(String[] args) throws MalformedURLException
	{
		
	//AndroidDriver<AndroidElement>  driver;

	 File appDir = new File("./src/main/java");
     File app = new File(appDir, "com.android.chrome.apk");
     DesiredCapabilities capabilities = new DesiredCapabilities();
     
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "c622c8e00704");
     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
     AndroidDriver<AndroidElement>driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    
	   // return driver;
}

}