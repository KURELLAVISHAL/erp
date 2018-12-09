package env;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.Scenario;
import managers.FileReaderManager;

public class Env 
{
	static WebDriver driver = null;
    Scenario s;
	

	static String browserName = null;
	
	public static String getBrowserName()
	{
		browserName = System.getProperty("browser"); 
		
		if(browserName == null)
			browserName = "ch";
		return browserName;
	}
	
	public static WebDriver CreateWebDriver(String browser)
	{
			System.out.println("Browser: " + browser);

			switch (browser.toLowerCase()) {
			case "ff":
			case "firefox":
				System.out.println("Firefox is selected");
				System.setProperty("webdriver.gecko.driver", "E:\\eclipse\\geckodriver.exe");
				driver=new FirefoxDriver();
				break;

			case "ch":
			case "chrome":
				System.out.println("Google chrome is selected");
				System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
				driver = new ChromeDriver();
				break;

			case "ie" :
			case "internetexplorer":
				System.out.println("Internet Explorer is selected");
				System.setProperty("webdriver.ie.driver", "E:\\eclipse\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				break;

			case "safari":
				System.out.println("Safari is selected");
				driver = new SafariDriver();
				break;
				
			 default:
				 System.out.println("Invalid browser name "+browser);
				 System.exit(0);
					break;	
			}//switch
				
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			return driver;
        }
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Env.driver = driver;
	}
	
	}
