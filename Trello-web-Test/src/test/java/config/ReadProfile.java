package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ford.web.Pages.FindByHome;

public  class ReadProfile 
{
	
	static WebDriver driver;
	
	@Test
	public void testcase() throws IOException 
	{
		Properties pro=new Properties();
		
		//"./Configuration/config.properties")
	    FileInputStream fs=new FileInputStream("./Configuration/config.properties");
		
 	   pro.load(fs);
 	   
 	   //store config data into Strings
 	   String BrowserName=pro.getProperty("browser");
 	   String url=pro.getProperty("Url"); 
 	   String name=pro.getProperty("username");
 	   String pass=pro.getProperty("Password");
 	   
 	   //Browser Setup's
 	   if(BrowserName.equals("Firefox"))
 	   {
 	 
 	  System.setProperty("webdriver.gecko.driver", "/home/qapitol/Downloads/SeleniumTools+Jars/geckodriver");
 	   driver=new FirefoxDriver();//launch firefox
 	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 	   }
 	   else if(BrowserName.equals("chrome"))
 	   {
 		  System.setProperty("webdriver.chrome.driver", "/home/qapitol/Downloads/SeleniumTools+Jars/ChromeDriver/chromedriver");
 		   driver=new ChromeDriver();//launch chrome
 		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 	   }
 	   
 	   //launch Url
 	   driver.get(url);
 	   
      //Create Object Of FindByHome Class
 	  FindByHome fm =new FindByHome();
 	  
 	  //Initialized webElements
 	  PageFactory.initElements(driver, fm);
 	 
 	 
 	  fm.ClickOnLoginText();
 	  fm.clickOnEmailText1(name);
 	  fm.clickOnPassText(pass);
 	  fm.Login();
 	  fm.ClickOnAddOption();
 	  fm.ClickOnCreateBoard();
 	  fm.ClickOnAddTitle("Sample_Board");
 	  fm.ClickOnBTn();
 	  fm.EnterAddListDeatils("Testing department");
 	  fm.AddList();
 	  fm.ClickOn_Add_A_Card();
 	  fm.AddCardTitle("Rajesh");
 	  fm.AddCard();
 	 
}

}