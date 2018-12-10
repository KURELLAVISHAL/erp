package com.erp.main.pagesImpl;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.main.pages.LoginPage;
import com.erp.main.pages.TopNav;

import env.Env;
import managers.PageObjectManager;


public class LoginPageImpl extends Env implements LoginPage
{

	PageObjectManager pageObjectManager;
	LoginPageImpl loginPageImpl;
	TopNavImpl topNavImpl;
	
	@FindBy(id="inputEmail")
	public WebElement userid;

	@FindBy(id="inputPassword")
	public WebElement pwd;

	@FindBy(name="Login")
	public WebElement loginBtn;
	

	@FindBy(xpath="//*[text()='User Authentication is Failed']")
	public WebElement invalidEmailPwdErr;
	
	
	public LoginPageImpl(WebDriver x)
	{
		x=Env.getDriver();
		PageFactory.initElements(x, this);
	}
	
	@Override
	public void fillUserId(String x) {
		// TODO Auto-generated method stub
		userid.clear();
		inputObj.enterText(userid, x);
	}

	@Override
	public void fillpwd(String x) {
		// TODO Auto-generated method stub
		pwd.clear();
		inputObj.enterText(pwd, x);
	}

	@Override
	public void clickLoginBtn() {
		// TODO Auto-generated method stub
		clickObj.click(loginBtn);
	}
	
	public void login()
	{
		fillUserId("accounts");
		fillpwd("8f5@INV");
		clickLoginBtn();
	}

	@Override
	public void validatePwdFields(String x) throws IOException
	{
		// TODO Auto-generated method stub
		pageObjectManager = new PageObjectManager(getDriver());
		loginPageImpl=pageObjectManager.getLoginPageImpl();
		topNavImpl=pageObjectManager.getTopNavImpl();
		if(x.equalsIgnoreCase("blank"))
		{
			
			System.out.println("blank test passesd");
		}
		else if(x.equalsIgnoreCase("blankuserid"))
		{
			
			System.out.println("blank user id test passed");
		}
		else if(x.equalsIgnoreCase("blankpwd"))
		{
			
			System.out.println("blank password test passed");
		}
		else if(x.equalsIgnoreCase("invalidpwd")&&loginPageImpl.invalidEmailPwdErr.isDisplayed())
		{
			
			System.out.println("invalid password test passed");
		}
		else if(x.equalsIgnoreCase("invaliduserid")&&loginPageImpl.invalidEmailPwdErr.isDisplayed())
		{
			
			System.out.println("invalid user id test passed");
		}
		else if(x.equalsIgnoreCase("valid")&&topNavImpl.profile.isDisplayed())
		{
			
			System.out.println("valid user id and password test  passed");
		}
		else {
			screenshotObj.takeScreenShot();
		}
		
	}

	
	
	
	}

	
	
	
	
	


