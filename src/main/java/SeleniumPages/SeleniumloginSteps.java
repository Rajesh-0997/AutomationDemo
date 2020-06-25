package SeleniumPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CommonSteps.BasePage;
import Utils.SyncUtills;

public class SeleniumloginSteps extends BasePage
{
	 BasePage page=new  BasePage();//object of BaseClass
	public void launchBrowser()
	{
		page.BrowserSetup();
		SyncUtills.wait(5);
		
	}
	
	public void openQarmaURL() 
	{
		 driver.get("");
	   	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	
	public void UserCredentila()
	{
		driver.findElement(By.xpath("//input[@placeholder='Email Id']")).sendKeys("");
		SyncUtills.wait(5);
    	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("");
    	SyncUtills.wait(5);
	}
	
	public void clickOnBtn()
	{
	 WebElement loginBtn=driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-btn-block']"));
	 loginBtn.click();
	 
	}

}
