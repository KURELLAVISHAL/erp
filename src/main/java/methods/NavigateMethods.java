package methods;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import env.BaseTest;
import env.Env;

public class NavigateMethods extends SelectElementByType implements BaseTest
{
	//SelectElementByType eleType= new SelectElementByType();
	private WebElement element=null;
	private String old_win = null;
	private String lastWinHandle;
	
	/** Method to open link
	 * @param url : String : URL for navigation
	 */
	public void navigateTo(String url) 
	{
		Env.getDriver().get(url);
	}
	
	/** Method to navigate back & forward
	 * @param direction : String : Navigate to forward or backward
	 */
	public void navigate(String direction)
	{
		if (direction.equals("back"))
			Env.getDriver().navigate().back();
		else
			Env.getDriver().navigate().forward();
	}
	
	/** Method to quite webdriver instance */
	public void closeDriver()
	{
		Env.getDriver().quit();
	}
	
	/** Method to return key by OS wise
	 * @return Keys : Return cntrl or command key as per OS
	 */
	public Keys get_key()
	{
		String os = System.getProperty("os.name").toLowerCase();
		if(os.contains("win"))
			return Keys.CONTROL;
		/*else if (os.contains("nux") || os.contains("nix"))
			return "Linux";*/
		else if (os.contains("mac"))
			return Keys.COMMAND;
		else
			return null;
			  /*os = Selenium::WebDriver::Platform.os
			  if os.to_s == 'windows'
			    return 'control'
			  elsif os.to_s == 'macosx'
			    return 'command'
			  else
			    raise 'Invalid OS'
			  end*/
	}
	
	/** Method to zoom in/out page
	 * @param inOut : String : Zoom in or out
	 */
	public void zoomInOut(String inOut)
	{
		WebElement Sel= Env.getDriver().findElement(getelementbytype("tagName","html"));
		if(inOut.equals("ADD"))
			Sel.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		else if(inOut.equals("SUBTRACT"))
			Sel.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		else if(inOut.equals("reset"))
			Sel.sendKeys(Keys.chord(Keys.CONTROL, Keys.NUMPAD0));
	}
	
	/** Method to zoom in/out web page until web element displays
	 * @param accessType : String : Locator type (id, name, class, xpath, css)
	 * @param inOut : String : Zoom in or out
	 * @param accessName : String : Locator value
	 */
	public void zoomInOutTillElementDisplay(WebElement element,String inOut)
	{
		Actions action = new Actions(Env.getDriver());
		//element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		while(true)
		{
			if (element.isDisplayed())
				break;
			else
				action.keyDown(get_key()).sendKeys(inOut).keyUp(get_key()).perform();
		}
	}
	
	/** Method to resize browser
	 * @param width : int : Width for browser resize
	 * @param height : int : Height for browser resize
	 */
	public void resizeBrowser(int width, int height)
	{
		Env.getDriver().manage().window().setSize(new Dimension(width,height));
	}
	
	/** Method to maximize browser	 */
	public void maximizeBrowser()
	{
		Env.getDriver().manage().window().maximize();
	}
	
	/** Method to hover on element
	 * @param accessType : String : Locator type (id, name, class, xpath, css)
	 * @param accessName : String : Locator value
	 */
	public void hoverOverElement(WebElement element)
	{
		Actions action = new Actions(Env.getDriver());
		//element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		
		action.moveToElement(element).perform();
	}
	
	/** Method to scroll page to particular element
	 * @param accessType : String : Locator type (id, name, class, xpath, css)
	 * @param accessName : String : Locator value
	 */
	public void scrollToElement(WebElement element)
	{
		//element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		
		JavascriptExecutor executor = (JavascriptExecutor)Env.getDriver();
		executor.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	
	/** Method to scroll page to top or end
	 * @param to : String : Scroll page to Top or End
	 * @throws Exception
	 */
	public void scrollPage(String to) throws Exception
	{
		JavascriptExecutor executor = (JavascriptExecutor)Env.getDriver();
		if (to.equals("end"))
			executor.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
		else if (to.equals("top"))
            executor.executeScript("window.scrollTo(Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight),0);");
		else
			throw new Exception("Exception : Invalid Direction (only scroll \"top\" or \"end\")");
	}
	
	/**Method to switch to new window */
    public void switchToNewWindow()
    {
    	old_win = Env.getDriver().getWindowHandle();
    	
    	for(String winHandle : Env.getDriver().getWindowHandles())
    		lastWinHandle = winHandle;
    	Env.getDriver().switchTo().window(lastWinHandle);
    }
    
    /** Method to switch to old window */
    public void switchToOldWindow()
    {
    	Env.getDriver().switchTo().window(old_win);
    	//System.out.println("++"+driver.switchTo().window(old_win).getTitle());
    }
    
    /** Method to switch to window by title
     * @param windowTitle : String : Name of window title to switch
     * @throws Exception */
    public void switchToWindowByTitle(String windowTitle) throws Exception
    {
    	System.out.println("++"+windowTitle+"++");
    	old_win = Env.getDriver().getWindowHandle();
    	boolean winFound = false;
    	for(String winHandle : Env.getDriver().getWindowHandles())
    	{
    		String str = Env.getDriver().switchTo().window(winHandle).getTitle();
    		System.out.println("**"+str+"**");
    		if (str.equals(windowTitle))
    		{
    			winFound = true;
    			break;
    		}
    	}
    	if (!winFound)
    		throw new Exception("Window having title "+windowTitle+" not found");
    }

    /**Method to close new window*/
    public void closeNewWindow()
    {
    	Env.getDriver().close();
    	//System.out.println("Closed driver");
    }
    
    /** Method to switch frame using frame index
     * @param index : Integer : Switch to frame by index
     * */
    public void switchFrameByIndex(int index)
    {
    	Env.getDriver().switchTo().frame(index);
    }
      
    /** Method to switch frame using frame name or id
     * @param nameorid : String : Switch to frame by Name or ID
     * */
    public void switchFrameByNameorId(String nameorid)
    {
    	Env.getDriver().switchTo().frame(nameorid);
    }
    
    /** Method to switch frame using web element frame
     * @param accessType : String : Locator type (id, name, class, xpath, css)
	 * @param accessName : String : Locator value
     * */
    public void switchFrameByWebElement(WebElement element)
    {
    	//element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
    	Env.getDriver().switchTo().frame(element);
    }
    
   

    /** method to switch to default content*/
    public void switchToDefaultContent()
    {
    	Env.getDriver().switchTo().defaultContent();
    }
    
    
    public void switchToActiveElement()
    {
    	Env.getDriver().switchTo().activeElement();
    }
}
