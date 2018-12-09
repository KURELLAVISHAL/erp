package methods;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import env.BaseTest;

public class InputMethods extends SelectElementByType implements BaseTest
{
	//SelectElementByType eleType= new SelectElementByType();
	private WebElement dropdown =null;
	private Select selectList=null;
	
	/** Method to enter text into text field
	 * @param accessType : String : Locator type (id, name, class, xpath, css)
	 * @param text : String : Text value to enter in field
	   @param accessName : String : Locator value
	 */
	
	
	public void enterText(WebElement element,String text)
	{
		//wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}
	
	/** Method to clear text of text field
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	*/
	public void clearText(WebElement element)
	{
		//wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		element.clear();
	}
	
	/** Method to select element from Dropdown by type
	 * @param select_list : Select : Select variable
	 * @param bytype : String : Name of by type
	 * @param option : String : Option to select
	 */
	public void selectelementfromdropdownbytype (Select select_list, String bytype, String option)
	{
		System.out.println("**"+bytype+"++"+option);
		if(bytype.equals("selectByIndex"))
		{
			int index = Integer.parseInt(option);
			select_list.selectByIndex(index-1);
		}
		else if (bytype.equals("value"))
			select_list.selectByValue(option);
		else if (bytype.equals("text"))
			select_list.selectByVisibleText(option);
	}
	
	/** Method to select option from dropdown list
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param by : String : Name of by type
	@param option : String : Option to select
	@param accessName : String : Locator value
	*/
	public void selectOptionFromDropdownByIndex(WebElement element, int option)
	{
		//dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		selectList=new Select(element);
		selectList.selectByIndex(option);
	}
	
	public void selectOptionFromDropDownByName(WebElement element, String text)
	{
		selectList=new Select(element);
		selectList.selectByVisibleText(text);
	}
	
	//method to select all option from dropdwon list
	/*public void select_all_option_from_multiselect_dropdown(String access_type, String access_name)
	{
		dropdown = CucumberRunner.driver.findElement(eletype.getelementbytype(access_type, access_name));
		select_list = new Select(dropdown);
		select_list.select_all
		Select all method not present in JAVA
	}*/
	
	/** Method to unselect all option from dropdwon list
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	*/
	public void unselectAllOptionFromMultiselectDropdown(WebElement element)
	{
		//dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		selectList = new Select(element);
		selectList.deselectAll();
	}
	
	/** Method to check check-box
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	*/
	public void checkCheckbox(WebElement element)
	{
		//WebElement checkbox= wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if (!element.isSelected())
			element.click();
	}
	
	/** Method to uncheck check-box
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	*/
	public void uncheckCheckbox(WebElement element)
	{
		//WebElement checkbox= wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if (element.isSelected())
			element.click();
	}
	
	
	/** Method to select radio button
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param accessName : String : Locator value
	*/
	public void selectRadioButton(WebElement element)
	{
		//WebElement radioButton = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if(!element.isSelected())
			element.click();
	}
	
	/** Method to select option from radio button group
	@param accessType : String : Locator type (id, name, class, xpath, css)
	@param by : String : Name of by type
	@param option : String : Option to select
	@param accessName : String : Locator value
	*/
	public void selectOptionFromRadioButtonGroup(List<WebElement> element, String by, String option)
	{
		//List<WebElement> radioButtonGroup = driver.findElements(getelementbytype(accessType, accessName));
		String getoption = null;
		
		/*System.out.println("cnt : "+radioButtonGroup.size());
		for(int i =0; i < radioButtonGroup.size() ; i++ ){
			System.out.println("In loop i: "+i);
			System.out.println(radioButtonGroup.get(i).isSelected());
		}*/
		
		for(WebElement temp : element)
		{
			if(by.equals("value"))
			{
				System.out.println("+++"+temp.getAttribute("value"));
				getoption = temp.getAttribute("value");
			}
			else
			{
				System.out.println("***"+temp.getText());
				getoption = temp.getText();
			}
			System.out.println("Element : "+getoption);
			if(getoption.equals(option) && !temp.isSelected())
				temp.click();
		}
		
	}
	//	List<WebElement> radioButtonGroup = CucumberRunner.driver.findElement(eletype.getelementbytype(access_type, access_name));
		

	/*  getter = ->(rb, by) { by == 'value' ? rb.attribute('value') : rb.text }
	  ele = radio_button_group.find { |rb| getter.call(rb, by) == option }
	  ele.click unless ele.selected?
	}*/
	
	public void selectRadioButtonByText(List<WebElement> element,String text)
	{
		int x=element.size()-1;
		for(int i=0;i<=x;i++)
		{
			if(text.equalsIgnoreCase(element.get(i).getText()))
			{
				element.get(i).click();
			}
		}
	}
}
