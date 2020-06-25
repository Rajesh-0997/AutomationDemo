package BrowserRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions
(
		features = {"./src/main/java/BrowserFunction"},
		dryRun = true,
		monochrome = true
		
)
public class BrowserTestNGRunner extends AbstractTestNGCucumberTests
{

}
