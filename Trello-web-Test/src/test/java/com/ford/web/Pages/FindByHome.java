package com.ford.web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ford.web.utils.SyncUtils;

public class FindByHome
{
	//@FindBy(linkText="Log In")
	
	@FindBy(xpath="//a[@class='btn btn-sm btn-link text-white']")
	WebElement clickOnLoginText;
	@FindBy(id="user")
	WebElement EmailText;
	@FindBy(id="password")
	WebElement PassText;
	@FindBy(id="login")
	WebElement LoginBtn;

	@FindBy(name="add")
			//"//button[@class='_33CvMKqfH4Yf0j _3SBHBJq0AAxzqg']//span[@class='_12-5x14JSgUact']")
			//+ "//div[@id='content']//div//div//div//div//div//div//div//nav//div//div//ul//li//button")
	WebElement clickOnAdd;
	
	@FindBy(xpath="//span[contains(text(),'Create Board')]")
	WebElement CreateBoard;
	
	@FindBy(xpath="//input[@placeholder='Add board title']")
	WebElement AddTitle;
	
	@FindBy(xpath="//button[@class='_3UeOvlU6B5KUnS uj9Ovoj4USRUQz _2MgouXHqRQDP_5']")
	WebElement Submit_Btn;
	
	@FindBy(xpath="//div[4]//div[1]//div[3]//a[1]//span[2]")
	WebElement Add_A_Card;
	
	
	@FindBy(xpath="//input[@placeholder='Enter list title...']")
	WebElement EnterTitle;
	
	@FindBy(xpath="//input[@class='primary mod-list-add-button js-save-edit']")
	WebElement AddList_Btn;
	
	@FindBy(xpath="//textarea[@placeholder='Enter a title for this card…']")
	WebElement Add_Card_Title;
	
	@FindBy(xpath="//input[@class='primary confirm mod-compact js-add-card']")
	WebElement AddCard_Btn;
	
	
	
	
	
	
	public void ClickOnLoginText()
	{
		clickOnLoginText.click();
	}
	
	public void clickOnEmailText1(String text1)
	{
		EmailText.click();
		SyncUtils.wait(5);
		EmailText.sendKeys(text1);
	}
	
	public void clickOnPassText(String text2)
	{
		PassText.click();
		SyncUtils.wait(5);
		PassText.sendKeys(text2);
	}
	
	public void Login()
	{
		LoginBtn.click();
		SyncUtils.wait(5);
		//CreateTeam.click();
		
	}
	
	public void ClickOnAddOption()
	{
		clickOnAdd.click();
		SyncUtils.wait(5);
	}
	
	public void ClickOnCreateBoard()
	{
		CreateBoard.click();
		SyncUtils.wait(5);
		
	}
	public void ClickOnAddTitle(String Title)
	{
		AddTitle.sendKeys(Title);
		SyncUtils.wait(5);
		
	}
	public void ClickOnBTn()
	{
		Submit_Btn.click();
		SyncUtils.wait(5);
	}
	
	public void EnterAddListDeatils(String ListTitle)
	{
		EnterTitle.sendKeys(ListTitle);
		SyncUtils.wait(5);
	
	}
	public void AddList()
	{
		AddList_Btn.click();
		//SyncUtils.wait(5);
	}
	public void ClickOn_Add_A_Card()
	{
		Add_A_Card.click();
		SyncUtils.wait(5);
	}
	
	public void AddCardTitle(String Card_Title)
	{
		Add_Card_Title.sendKeys(Card_Title);
		SyncUtils.wait(5);
	}
	
	public void AddCard()
	{
		AddCard_Btn.click();
		
    }
}
