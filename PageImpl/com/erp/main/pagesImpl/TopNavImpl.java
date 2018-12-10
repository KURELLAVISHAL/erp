package com.erp.main.pagesImpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.main.pages.LoginPage;
import com.erp.main.pages.TopNav;

import env.Env;
import managers.PageObjectManager;
import methods.ExplicitWaitMethods;

public class TopNavImpl extends Env implements TopNav{

	PageObjectManager pageObjectManager;
	LoginPageImpl loginPageImpl;
	
	@FindBy(xpath="(//*[@class='pull-right'])[1]")
	public WebElement profile;
	
	@FindBy(xpath="//*[text()='Sign Out']")
	public WebElement logout;
	
	@FindBy(xpath="//*[@src='images/hff_logo.png']")
	public WebElement hffLogo;
	
	public TopNavImpl(WebDriver x)
	{
		x=Env.getDriver();
		PageFactory.initElements(x, this);
	}
	
	@Override
	public void clickLogout() {
		// TODO Auto-generated method stub
		pageObjectManager = new PageObjectManager(getDriver());
		loginPageImpl=pageObjectManager.getLoginPageImpl();
		clickObj.clickForcefully(logout);
		if(loginPageImpl.loginBtn.isDisplayed())
		{
			System.out.println("logout sucessfully");
		}
		
	}

	@Override
	public void clickProfile() {
		// TODO Auto-generated method stub
		clickObj.click(profile);
	}

	@Override
	public void clickHffLogo() {
		// TODO Auto-generated method stub
		clickObj.click(hffLogo);
	}

	@Override
	public void doLogout() {
		// TODO Auto-generated method stub
		clickProfile();
		clickLogout();
	}
	
	

}
