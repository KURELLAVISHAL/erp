package com.erp.main.pagesImpl;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.erp.main.pages.AddCardDetailsPage;

import env.Env;

public class AddCardDetailsPageImpl extends Env implements AddCardDetailsPage
{

	
	@FindBy(xpath="(//*[@id='cardNo'])[1]")
	public WebElement cardNumber;
	
	@FindBy(xpath="//*[@class='demo-radio-button']/label")
	public List<WebElement> cardType;
	
	@FindBy(xpath="(//*[@id='validatyFrom'])[1]")
	public WebElement validityFrom;
	
	@FindBy(xpath="(//*[@id='validatyTo'])[1]")
	public WebElement validityTo;
	
	public AddCardDetailsPageImpl(WebDriver x)
	{
		x=Env.getDriver();
		PageFactory.initElements(x, this);
	}
	
	public void enterCardNumber(String x)
	{
		inputObj.enterText(cardNumber, x);
	}
	
	public void selectRadioButton(String y)
	{
		inputObj.selectRadioButtonByText(cardType, y);
	}
	
	public void enterValidityFrom(String x)
	{
		inputObj.enterText(validityFrom, x);
	}
	
	public void enterValidityTo(String x)
	{
		inputObj.enterText(validityTo, x);
	}

	
}
