package AppiumPages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Utils.SyncUtils;

public class TestRunner extends BasePage {

	@Test
	public void SampleTest() throws IOException 
	{
		Properties pro = new Properties();

		FileInputStream fs = new FileInputStream(
				"/home/qapitol/Desktop/27-5-20+WebUiAutomation/AppiumDemo/src/test/resources/Configuration/config.properties");

		  pro.load(fs);
		  
		//store the value of properties file here
		String name = pro.getProperty("username");
		String pass = pro.getProperty("password");
		String BoardName=pro.getProperty("Board_Name");
		String ListName=pro.getProperty("List_Name");
		String cardname=pro.getProperty("Enter_Card_Name");
		
		
		
//call the methods or variable of the class with class object
		HomePage p=new HomePage(driver);
		//SwipePage s=new SwipePage(driver);
		p.login_Text_Btn.click();
		//p.Email_Locator_Id.sendKeys(name);
		////p.Next_Locator_Id.click();
	//	p.Pass_Locator_id.sendKeys(pass);
		//p.ClickOnLoginBtn.click();
		p.ClickOnGoogleAccount.click();
		p.SelectAnyOne.click();
		p.ClickOnPlus_Icon.click();
		p.TapOnBoardIcon.click();
		p.CreateBoard_Name.sendKeys(BoardName);
		p.TapOnCraete_Btn.click();
		p.TapOnAddList_Btn.click();
		p.AddListName.sendKeys(ListName);
		p.Confirm_Btn.click();
		p.TapOnAddCard.click();
		p.EnterCardName.sendKeys(cardname);
		p.Confirm.click();
		p.TapOnCancelBtn.click();
		p.TapOnThree_Dot_Section.click();
		p.TapOnBoardSetting_Btn.click();
		SyncUtils.wait(10);
		//p.swipeUp();
		p.getswipeUp(driver);
		SyncUtils.wait(7);
		
		 p.CloseBoard.click();
		//p.TapOnBackBtn.click();
		
		
		
		
		
		

	
		
		

	}
	

}
