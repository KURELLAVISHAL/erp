package com.erp.main.pagesImpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.erp.main.pages.AddBankDetailsPage;

import env.Env;

public class AddBankDetailsPageImpl extends Env implements AddBankDetailsPage{

	

	
	@FindBy(xpath="(//*[@id='accountType'])[1]")
	public WebElement bankAccountType;
	
	@FindBy(xpath="(//*[@id='bankaccountno'])[1]")
	public WebElement bankAccountNumber;
	
	@FindBy(xpath="(//*[@id='ifsccode'])[1]")
	public WebElement ifscCode;
	
	@FindBy(xpath="(//*[@id='nameasperBank'])[1]")
	public WebElement nameAsPerBankRecord;
	
	
	public AddBankDetailsPageImpl(WebDriver x)
	{
		x=Env.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void selectBankAccountType(String text)
	{
		
		inputObj.selectOptionFromDropDownByName(bankAccountType, text);
	}
	
	public void enterBankAccountNumber(String x)
	{
		inputObj.enterText(bankAccountNumber, x);
	}
	
	public void enterIfscCode(String x)
	{
		inputObj.enterText(ifscCode, x);
	}
	
	public void enterNameAsPerBankRecord(String x)
	{
		inputObj.enterText(nameAsPerBankRecord, x);
		
		
	}
	
	

}
