package com.erp.main.pagesImpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.main.pages.AddAddressDetailsPage;

import env.Env;

public class AddAddressDetailsPageImpl extends Env implements AddAddressDetailsPage{


	
	@FindBy(xpath="//*[@id='pincode']")
	public WebElement pincode;
	
	@FindBy(xpath="(//*[@id='street'])[1]")
	public WebElement street;
	
	@FindBy(xpath="(//*[@name='locality'])[1]")
	public WebElement areaLocality;
	
	@FindBy(xpath="(//*[@id='city'])[1]")
	public WebElement city;
	
	@FindBy(xpath="(//*[@id='mandal'])[1]")
	public WebElement region;
	
	@FindBy(xpath="(//*[@id='country'])[1]")
	public WebElement country;
	
	public AddAddressDetailsPageImpl(WebDriver x)
	{
		
		x=Env.getDriver();
		PageFactory.initElements(x, this);
	}
	
	public void enterPincode(String x) 
	{
		inputObj.enterText(pincode, x);
	}
	
	public void enterArealocality(String x) 
	{
		inputObj.enterText(areaLocality, x);
	}
	
	public void enterStreet(String x)
	{
		inputObj.enterText(street, x);
	}
	
	

}
