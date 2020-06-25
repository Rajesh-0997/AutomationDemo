package AppiumPages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Loactors_Page
{
	//private static MobileElement mobdriver;
	
	@AndroidFindBy(id="com.trello:id/log_in_button")
	 public static MobileElement Login_Text_Locator_Id;
	
	@AndroidFindBy(id="com.trello:id/user")
	public static MobileElement Email_Locator_Id;
	
	@AndroidFindBy(id="com.trello:id/authenticate")
	public static MobileElement Next_Locator_Id;
	
	
	 // MobileElement mobdriver;
	
	
	

}
