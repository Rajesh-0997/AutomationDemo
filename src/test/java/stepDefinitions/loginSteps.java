package stepDefinitions;

//import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import SeleniumPages.SeleniumloginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
//import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;

public class loginSteps 
{
	WebDriver driver;
	SeleniumloginSteps step=new SeleniumloginSteps();
	
    @Given("^I launch browser page$")
    public void i_launch_browser_page()  throws InterruptedException
    {
    	System.out.println("launch browser");
    	step.launchBrowser();
    	System.out.println("launch browser");
       
    }
    @When("^User enter url on browser Search text$")
    public void user_enter_url_on_browser_search_text() throws InterruptedException
    {
    	System.out.println("User enter url on browser Search text");
    	step.openQarmaURL();
    	
    }

    @When("^ Title of login page is Log in to Qarma$")
    public void title_of_login_page_is_log_in_to_qarma()  throws InterruptedException
    {
    	 System.out.println("Title of login page is Log in to Qarma");
	      String title=driver.getTitle();
	       System.out.println("Login Page:"+title);
	      
    }

    @Then("^ User enters username and password$")
    public void user_enters_username_and_password() throws InterruptedException
    {
    	 System.out.println("User enters username and password");
    	 step.UserCredentila();
    	
    	
       
    }

    @Then("^ Users Clicks on login button$")
    public void users_clicks_on_login_button()  throws InterruptedException
    {
    	 System.out.println("Users Clicks on login button");
    	 step.clickOnBtn();
    		
       
    }

    @Then("^ User is on home page$")
    public void user_is_on_home_page()  throws InterruptedException
    {
    	 String title=driver.getTitle();
	      System.out.println("Homepage title is::"+title);
    	System.out.println(" User is on home page");
    	
        
     }

}
