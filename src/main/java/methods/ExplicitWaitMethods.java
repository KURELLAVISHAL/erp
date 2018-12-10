package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import env.BaseTest;
import env.Env;

public class ExplicitWaitMethods implements BaseTest
{
public static WebDriver driver;

	
	/*Select using WebElements*/
	/** To Wait Until Element to be Clickable */	
	public  void explicitWaitElementToBeClickable(WebElement element, int time) 
	{
		WebDriverWait clickableWait = new WebDriverWait(Env.getDriver(), time);
		clickableWait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	
	/** To Wait Until Element to be Selectable */
	public  void explicitWaitElementToBeSelected(WebElement element, int time) {
		WebDriverWait selectableWait = new WebDriverWait(Env.getDriver(), time);
		selectableWait.until(ExpectedConditions.elementToBeSelected(element));
	}
	

	/** To Wait Until Element has the text */
	public  void explicitWaitTextToBePresentInElement(WebElement element, int time, String text) {
		WebDriverWait textToBePresent = new WebDriverWait(Env.getDriver(), time);
		textToBePresent.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	
	
	/** To Wait Until Title contains the text */
	public  void explicitWaitTitleContains(WebElement element, int time, String title) {
		WebDriverWait titleContains = new WebDriverWait(Env.getDriver(), time);
		titleContains.until(ExpectedConditions.titleContains(title));
	}
	
	
	/** To Wait Until Title is */
	public  void explicitWaitTitleIs(WebElement element, int time, String title) {
		WebDriverWait titleIs = new WebDriverWait(Env.getDriver(), time);
		titleIs.until(ExpectedConditions.titleIs(title));
	}
	
	
	/** To Wait Until Element to be Visible */
	public  void explicitWaitVisibilityOfElement(WebElement element, int time) {
		WebDriverWait elementToBeVisible = new WebDriverWait(Env.getDriver(), time);
		elementToBeVisible.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	/** To Wait Until Element is Selected */
	public  void explicitWaitSelectionStateToBe(WebElement element, int time, boolean selected) {
		WebDriverWait elementIsSelected = new WebDriverWait(Env.getDriver(), time);
		elementIsSelected.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
	}
	
	
	/** To Wait Until Elements to be Visible */
	public  void explicitWaitVisibilityOfElements(List<WebElement> element, int time) {
		WebDriverWait elementsToBeVisible = new WebDriverWait(Env.getDriver(), time);
		elementsToBeVisible.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	
	/*Select using By Method*/
	/** To Wait Until Element to be Clickable */	
	public  void explicitWaitElementToBeClickable(By element, int time) {
		WebDriverWait clickableWait = new WebDriverWait(Env.getDriver(), time);
		clickableWait.until(ExpectedConditions.elementToBeClickable(element));
	}


	/** To Wait Until Element to be Selectable */
	public  void explicitWaitElementToBeSelected(By element, int time) {
		WebDriverWait selectableWait = new WebDriverWait(Env.getDriver(), time);
		selectableWait.until(ExpectedConditions.elementToBeSelected(element));
	}


	/** To Wait Until Title contains the text */
	public  void explicitWaitTitleContains(By element, int time, String title) {
		WebDriverWait titleContains = new WebDriverWait(Env.getDriver(), time);
		titleContains.until(ExpectedConditions.titleContains(title));
	}


	/** To Wait Until Title is */
	public  void explicitWaitTitleIs(By element, int time, String title) {
		WebDriverWait titleIs = new WebDriverWait(Env.getDriver(), time);
		titleIs.until(ExpectedConditions.titleIs(title));
	}


	/** To Wait Until Element to be Visible */
	public  void explicitWaitVisibilityOfElement(By element, int time) {
		WebDriverWait elementToBeVisible = new WebDriverWait(Env.getDriver(), time);
		elementToBeVisible.until(ExpectedConditions.visibilityOfElementLocated(element));
	}


	/** To Wait Until Element is Selected */
	public  void explicitWaitSelectionStateToBe(By element, int time, boolean selected) {
		WebDriverWait elementToBeVisible = new WebDriverWait(Env.getDriver(), time);
		elementToBeVisible.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
	}

	
	/** To Wait for the Alert */
	public  void explicitWaitForAlert(int time) {
		WebDriverWait waitForAlert = new WebDriverWait(Env.getDriver(), time);
		waitForAlert.until(ExpectedConditions.alertIsPresent());
	}
	
	public  void waitForVisibility(WebElement element) 
	{
	       
	       wait.until(ExpectedConditions.visibilityOf(element));
	}
}
