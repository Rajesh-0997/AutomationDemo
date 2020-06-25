package com.ford.web.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ford.web.core.Constants;

public  class HomePage
{

	WebDriver driver=null;
	static WebElement ele;
	
	
	//Methods
	
	
	public void ClickOnLoginText()
	{
	
		driver.findElement(By.xpath(Constants.LoginTextxpath)).click();
		
			
	}
	public void EnterEmailText(String text1)
	{
		
		ele=driver.findElement(By.xpath(Constants.EmailTextxapth));
		ele.clear();
		ele.click();
		ele.sendKeys(text1);
		
	
	}
	public void EnterPassText(String text2)
	{
		ele=driver.findElement(By.xpath(Constants.PassTextxapth));
		ele.clear();
		ele.click();
		ele.sendKeys(text2);
	}
	public void ClickBtn()
	{
		ele=driver.findElement(By.xpath(Constants.LoginBtnxapth));
		ele.click();
		
		
	}
	
	
	public void clickOnCreateBoard()
	{
		// SyncUtils.wait(5);
		ele=driver.findElement(By.xpath(Constants.ClickOnCreateTeam_Btnxapth));
		ele.click();
		
	}
	
	
	 public void ClickOnTeamNameText(String TeamName)
	
	{
		 ele=driver.findElement(By.xpath(Constants.TeamNameTextxapth));
		 
		 ele.clear();
		 ele.click();
		 ele.sendKeys(TeamName);
		 
	}

	 public void ClickOnDropBox()
	
	{
		 ele=driver.findElement(By.xpath(Constants.ClickOnChooseXapth));
		 ele.click();
		 Select sel=new Select(ele);
		 sel.selectByVisibleText("Engineering-IT");
		

		 
	}
	 
	
	
		

}
