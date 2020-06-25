package AppiumPages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HomePage 
{
	 //Is to call the driver object from TestCase to pageobject
	
    //Concatenate driver
	public HomePage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
		
	}
	
	@AndroidFindBy(id="com.trello:id/log_in_button")
	public WebElement login_Text_Btn;
	
	@AndroidFindBy(id="com.trello:id/user")
	public  WebElement Email_Locator_Id;
	
	@AndroidFindBy(id="com.trello:id/authenticate")
	public static WebElement Next_Locator_Id;
	
	
	@AndroidFindBy(id="com.trello:id/password")
	public WebElement Pass_Locator_id;
	
	@AndroidFindBy(id="com.trello:id/authenticate")
	public static WebElement ClickOnLoginBtn;
	
// SignIn with Google Accounts
	@AndroidFindBy(id="com.trello:id/google_auth")
	public WebElement ClickOnGoogleAccount;
	
	@AndroidFindBy(id="com.google.android.gms:id/account_name")
	public WebElement SelectAnyOne;
	
//Perform Actions on home page Elements
	
	@AndroidFindBy(id="com.trello:id/add_fab")
	public WebElement ClickOnPlus_Icon;
	
	@AndroidFindBy(id="com.trello:id/add_board_text")
	public WebElement TapOnBoardIcon;
	
	@AndroidFindBy(id="com.trello:id/board_name")
	public WebElement CreateBoard_Name;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Create\"]")
	public WebElement TapOnCraete_Btn;
	
	@AndroidFindBy(id="com.trello:id/add_list_button")
	public WebElement TapOnAddList_Btn;
	
	@AndroidFindBy(id="com.trello:id/list_name_edit_text")
	public WebElement AddListName;
	
	@AndroidFindBy(id="com.trello:id/confirm")
	public WebElement Confirm_Btn;
	

	@AndroidFindBy(id="com.trello:id/add_button")
	public WebElement TapOnAddCard;
	
	@AndroidFindBy(id="com.trello:id/card_name_edit_text")
	public WebElement EnterCardName;
	
	@AndroidFindBy(xpath="com.trello:id/confirm")
	public WebElement Confirm;
	

	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Cancel\"]")
	public WebElement TapOnCancelBtn;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Close\"]")
	public WebElement TapOnBackBtn;
	
	@AndroidFindBy(id="com.trello:id/board_sections")
	public WebElement TapOnThree_Dot_Section;
	
	@AndroidFindBy(id="com.trello:id/settings_button")
	public WebElement TapOnBoardSetting_Btn;
	
	@AndroidFindBy(xpath=" //android.widget.TextView[@text='Close board']")
	public WebElement CloseBoard;
	
	
	
	public void getswipeUp(AppiumDriver driver)
	{
	
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
			
	org.openqa.selenium.Dimension dim = driver.manage().window().getSize();
	int height = dim.getHeight();
	int width = dim.getWidth();

	int startx = (width/2);
	int endx = (width/2);
	int starty = (int) (height*0.8);
	int endy = (int) (height*0.2);

	@SuppressWarnings("rawtypes")
	TouchAction action = new TouchAction(driver);
	action.press(PointOption.point(startx, starty))
	.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	.moveTo(PointOption.point(endx, endy)).release().perform();
	}
	
	}
	
	

	

