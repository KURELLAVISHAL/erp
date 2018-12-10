


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import env.Env;
import managers.FileReaderManager;
import managers.TestContext;

import org.apache.log4j.Logger;

public class Hooks
{
	
	TestContext testContext;
	 
	 public Hooks(TestContext context) {
	 testContext = context;
	 }
	 
	Logger log = Logger.getLogger(Hooks.class);
	Scenario scenario = null;
	
	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
		
		Env.CreateWebDriver(Env.getBrowserName());
	}
	
	@After
 	/**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
       
        if(scenario.isFailed()) {
	        try {
	        	scenario.write("The scenario failed.");
	        	scenario.write("Current Page URL is " + Env.getDriver().getCurrentUrl());
	            byte[] screenshot = ((TakesScreenshot)Env.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "resources/screenshot");
	        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
	            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
	        }	        
        }
        log.info("vishal");
		log.info("***********************************************************************************************************");
		log.info("[ Driver Status ] - Clean and close the intance of the driver");
		log.info("***********************************************************************************************************");
		Env.getDriver().quit();
        
    }
}
