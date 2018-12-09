package com.erp.main.pagesImpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.main.pages.AddUserDetailsPage;

import env.Env;

public class AddUserDetailsPageImpl extends Env implements AddUserDetailsPage
{

	
	@FindBy(xpath="(//*[@id='fullname'])[3]")
	public WebElement name;
	
	@FindBy(xpath="(//*[@id='emptype'])[1]")
	public WebElement empType;
	
	@FindBy(xpath="(//*[@id='designation'])[1]")
	public WebElement designation;
	
	@FindBy(xpath="(//*[@id='dob'])[1]")
	public WebElement dob;
	
	@FindBy(xpath="(//*[@id='joiningdate'])[1]")
	public WebElement joiningDate;
	
	@FindBy(xpath="(//*[@id='mobile'])[1]")
	public WebElement mobileNumber;
	
	@FindBy(xpath="(//*[@id='email'])[1]")
	public WebElement email;
	
	@FindBy(xpath="(//*[@id='panno'])[1]")
	public WebElement panNumber;
	
	public AddUserDetailsPageImpl(WebDriver x)
	{
		
		x=Env.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void enterName(String x)
	{
		inputObj.enterText(name, x);
	}

	@Override
	public void enterJoiningDate(String x) {
		// TODO Auto-generated method stub
		inputObj.enterText(joiningDate, x);
	}

	@Override
	public void enterDob(String x) {
		// TODO Auto-generated method stub
		inputObj.enterText(dob, x);
	}

	

	@Override
	public void enterMobileNo(String x) {
		// TODO Auto-generated method stub
		inputObj.enterText(mobileNumber, x);
	}

	@Override
	public void enterDesignation(String x) {
		// TODO Auto-generated method stub
		inputObj.enterText(designation, x);
	}

	@Override
	public void enterEmail(String x) {
		// TODO Auto-generated method stub
		inputObj.enterText(email, x);
	}

	@Override
	public void enterPanNo(String x) {
		// TODO Auto-generated method stub
		inputObj.enterText(panNumber, x);
	}
}
