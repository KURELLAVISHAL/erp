package methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import env.BaseTest;

public class AssertionMethods extends SelectElementByType implements BaseTest
{
	//This file contains assertion methods which are called from predefinedStepDefinitions

	//SelectElementByType eleType= new SelectElementByType();
	private WebElement element=null;
		
	/** Method to get page title
	 * @return String
	 * */
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	/** Method to verify page title
	* @param title : String : expected title
	* @param testCase : Boolean : test case [true or false]
	*/
	public void checkTitle(String title,boolean testCase) throws TestCaseFailed
	{
		System.out.println("Title "+ title+"\n TestCase "+testCase);
		String pageTitle = getPageTitle();
		
		/*System.out.println("**"+pageTitle+"**"+title+"**");
		System.out.println("++"+ pageTitle.equals(title));*/

		if (testCase)
		{
			//System.out.println("In if \n----"+pageTitle.equals(title));
			if(!pageTitle.equals(title))
				throw new TestCaseFailed("Page Title Not Matched, Actual Page Title : "+pageTitle);
		}
		else
		{
			if(pageTitle.equals(title))
				throw new TestCaseFailed("Page Title Matched, Actual Page Title : "+pageTitle);
		}
	}
	
	/** Method to verify partial page title
	* @param partialTitle : String : partial title string
	* @param testCase : Boolean : test case [true or false] 
	*/
	public void checkPartialTitle(String partialTitle,boolean testCase) throws TestCaseFailed
	{
		String pageTitle = getPageTitle();
		if(testCase)
		{
			if(!pageTitle.contains(partialTitle))
				throw new TestCaseFailed("Partial Page Title Not Present, Actual Page Title : "+pageTitle);
		}
		else
		{
			if(pageTitle.contains(partialTitle))
				throw new TestCaseFailed("Partial Page Title Present, Actual Page Title : "+pageTitle);
		}
	}

	/** Method to get element text
	 * @param accessType : String : Locator type (id, name, class, xpath, css)
	 * @param accessName : String : Locator value
	 * @return String
	 */
	public String getElementText(WebElement element)
	{
		//element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		return element.getText();
		
	}
	
	/** Method to check element text
	* @param accessType : String : Locator type (id, name, class, xpath, css)
	* @param actualValue : String : Expected element text
	* @param accessName : String : Locator value
	* @param testCase : Boolean : test case [true or false]
	*/
	public void checkElementText(WebElement element,String actualValue,boolean testCase) throws TestCaseFailed
	{
		String elementText = getElementText(element);
		
		if (testCase)
		{
			if (!elementText.equals(actualValue))
				throw new TestCaseFailed("Text Not Matched");
		}
		else
		{
			if (elementText.equals(actualValue))
				throw new TestCaseFailed("Text Matched");
		}
	}
	
	/** Method to check partial element text
	* @param accessType : String : Locator type (id, name, class, xpath, css)
	* @param actualValue : String : Expected element text
	* @param accessName : String : Locator value
	* @param testCase : Boolean : test case [true or false]
	*/
	public void checkElementPartialText(WebElement element,String actualValue,boolean testCase) throws TestCaseFailed
	{
		String elementText = getElementText(element);

	    if (testCase)
	    {
	    	if (!elementText.contains(actualValue))
	    		throw new TestCaseFailed("Text Not Matched");
	    }
	    else
	    {
	    	if (elementText.contains(actualValue))
	    		throw new TestCaseFailed("Text Matched");
	    }
	}
	
	/** Method to return element status - enabled?
	* @param accessType : String : Locator type (id, name, class, xpath, css)
	* @param accessName : String : Locator value
	* @return Boolean
	*/
	public boolean isElementEnabled(WebElement element)
	{
		//element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		return element.isEnabled();
	}
	
	/** Element enabled checking
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	@param testCase : Boolean : test case [true or false]
	*/
	public void checkElementEnable(WebElement element, boolean testCase) throws TestCaseFailed
	{
		boolean result=isElementEnabled(element);
		if(testCase)
		{
			if (!result)
				throw new TestCaseFailed("Element Not Enabled");
		}
		else 
		{ 
			 if(result)
				 throw new TestCaseFailed("Element Enabled");
		}
	}	  
	
	/** method to get attribute value
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	@param attributeName : String : attribute name
	@return String
	*/
	public String getElementAttribute(WebElement element,String attributeName)
	{
		//element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		return element.getAttribute(attributeName);
	}
	
	/** method to check attribute value
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param attributeName : String : attribute name
	@param attributeValue : String : attribute value
	@param accessName : String : Locator value
	@param testCase : Boolean : test case [true or false]
	*/
	public void checkElementAttribute(WebElement element, String attributeName, String attributeValue, boolean testCase) throws TestCaseFailed
	{
		String attrVal = getElementAttribute(element, attributeName);
		if(testCase)
		{
			if(!attrVal.equals(attributeValue))
				throw new TestCaseFailed("Attribute Value Not Matched");
		}
		else 
		{
			if(attrVal.equals(attributeValue))
				throw new TestCaseFailed("Attribute Value Matched");
		}
	}
	
	/** method to get element status - displayed?
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	@return Boolean
	*/
	public boolean isElementDisplayed(WebElement element)
	{
		//element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		return element.isDisplayed();
	}
	
	/** method to check element presence
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	@param testCase : Boolean : test case [true or false]
	*/
	public void checkElementPresence(WebElement element,boolean testCase) throws TestCaseFailed
	{
		if (testCase)
		{
			if (!isElementDisplayed(element))
				throw new TestCaseFailed("Element Not Present");
		}
		else
		{
			try
			{
				if(isElementDisplayed(element))
					throw new Exception("Present"); //since it is negative test and we found element
			}
			catch(Exception e)
			{
				if(e.getMessage().equals("Present")) //only raise if it present
					throw new TestCaseFailed("Element Present");
			}
		}
	}
	
	/** method to assert checkbox check/uncheck
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	@param shouldBeChecked : Boolean : test case [true or false]
	*/
	public void isCheckboxChecked(WebElement element,boolean shouldBeChecked) throws TestCaseFailed
	{
		//WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if((!element.isSelected()) && shouldBeChecked)
			throw new TestCaseFailed("Checkbox is not checked");
		else if(element.isSelected() && !shouldBeChecked)
			throw new TestCaseFailed("Checkbox is checked");
	}
	
	/** method to assert radio button selected/unselected
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	@param shouldBeChecked : Boolean : test case [true or false]
	*/
	public void isRadioButtonSelected(WebElement element,boolean shouldBeSelected) throws TestCaseFailed
	{
		//WebElement radioButton = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if((!element.isSelected()) && shouldBeSelected)
			throw new TestCaseFailed("Radio Button not selected");
		else if(element.isSelected() && !shouldBeSelected)
			throw new TestCaseFailed("Radio Button is selected");
	}

	//method to assert option from radio button group is selected/unselected
	
	
	/** method to get javascript pop-up alert text
	 * @return String
	 */
	public String getAlertText()
	{
		return driver.switchTo().alert().getText();
	}
	  
	/**method to check javascript pop-up alert text
	 * @param text : String : Text to verify in Alert
	 * @throws TestCaseFailed
	 */
	public void checkAlertText(String text) throws TestCaseFailed
	{
		if(!getAlertText().equals(text))
			throw new TestCaseFailed("Text on alert pop up not matched");
	}
	
	  /*radio_button_group = WAIT.until{ $driver.find_elements(:"#{access_type}" => "#{access_name}") }

	  getter = ->(rb, by) { by == 'value' ? rb.attribute('value') : rb.text }

	  ele = radio_button_group.find { |rb| getter.call(rb, by) == option }

	  if !ele.selected? && should_be_selected
	    raise TestCaseFailed, 'Radio button is not selected'
	  elsif ele.selected? && !should_be_selected
	    raise TestCaseFailed, 'Radio button is selected'
	  end
	end*/
	
	/*method to get javascript pop-up alert text
	def get_alert_text
	  $driver.switch_to.alert.text
	end*/
	
	/** Method to verify if the particular option is Selected from Dropdown
	 * @param accessType : String : Locator type (id, name, class, xpath, css)
	 * @param by : String : Select element from dropdown by text or value
	 * @param option : String : Element to select from dropdown  
	 * @param accessName : String : Locator value
	 * @param shouldBeSelected : Boolean : test case [true or false]
	 * @throws TestCaseFailed
	 */
	public void isOptionFromDropdownSelected(WebElement element,String by,String option,boolean shouldBeSelected) throws TestCaseFailed
	{
		Select selectList=null;
		//WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		selectList = new Select(element);
		
		String actualValue=null;
		if(by.equals("text"))
			actualValue = selectList.getFirstSelectedOption().getText();
		else
			actualValue = selectList.getFirstSelectedOption().getAttribute("value");
		
		if((!actualValue.equals(option))&&(shouldBeSelected))
			throw new TestCaseFailed("Option Not Selected From Dropwdown");
		else if ((actualValue.equals(option))&&(!shouldBeSelected))
			throw new TestCaseFailed("Option Selected From Dropwdown");
	}
}
