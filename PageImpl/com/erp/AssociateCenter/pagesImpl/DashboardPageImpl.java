package com.erp.AssociateCenter.pagesImpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.AssociateCenter.pages.DashboardPage;
import com.erp.main.pages.TopNav;
import com.erp.main.pagesImpl.TopNavImpl;

import env.Env;
import managers.PageObjectManager;
import methods.ExplicitWaitMethods;

public class DashboardPageImpl extends Env implements DashboardPage
{
	PageObjectManager pageObjectManager= new PageObjectManager(getDriver());
	TopNavImpl topNavImpl=pageObjectManager.getTopNavImpl();
	
	@FindBy(xpath="//*[@class='panel panel-success panel-colorful']")
	public WebElement associateCener;
	
	@FindBy(xpath="//*[text()='Employee List']")
	public WebElement employeeList;
	
	@FindBy(xpath="//*[@class='panel panel-info panel-colorful']")
	public WebElement vendorCenter;
	
	@FindBy(xpath="//*[text()='Vendor-Employee List']")
	public WebElement vendorEmployeeList;
	
	@FindBy(xpath="//*[@class='panel panel-purple panel-colorful']")
	public WebElement donorCustomerCenter;
	
	@FindBy(xpath="//*[text()='Donor/Customer  List']")
	public WebElement donorCustomerCenterList;
	
	
	@FindBy(xpath="//*[@class='panel panel-warning panel-colorful']")
	public WebElement bankCenter;
	
	@FindBy(xpath="//*[text()='Bank List']")
	public WebElement bankList;
	
	@FindBy(xpath="//*[@class='panel panel-org panel-colorful']")
	public WebElement organizationCenter;
	
	@FindBy(xpath="//*[text()='GL Account Type List']")
	public WebElement glAccountList;
	
	@FindBy(xpath="//*[@class='panel panel-cent panel-colorful']")
	public WebElement reportsCenter;
	
	@FindBy(xpath="//*[text()=' Report ']")
	public WebElement report;
	
	public DashboardPageImpl(WebDriver x)
	{
		x=Env.getDriver();
		PageFactory.initElements(x, this);
	}
	
	public void clickAssociateCenter()
	{
		explicitObj.waitForVisibility(associateCener);
		clickObj.click(associateCener);
	}
	
	public void clickVendorCenter()
	{
		explicitObj.waitForVisibility(vendorCenter);
		clickObj.click(vendorCenter);
	}
	
	public void clickDonorCustomerCenter()
	{
		explicitObj.waitForVisibility(donorCustomerCenter);
		clickObj.click(donorCustomerCenter);
	}
	
	public void clickBankCenter()
	{
		explicitObj.waitForVisibility(bankCenter);
		clickObj.click(bankCenter);
	}
	
	public void clickOrganizationCenter()
	{
		explicitObj.waitForVisibility(organizationCenter);
		clickObj.click(organizationCenter);
	}
	
	public void clickReportsCenter()
	{
		explicitObj.waitForVisibility(reportsCenter);
		clickObj.click(reportsCenter);
	}

	//TopNav t=new TopNavImpl(getDriver());
	
	@Override
	public void checkDashboardLinks() {
		// TODO Auto-generated method stub
		
		topNavImpl.clickHffLogo();
		clickAssociateCenter();
		if(employeeList.isDisplayed())
		{
			topNavImpl.clickHffLogo();
		}
		clickVendorCenter();
	    if(vendorEmployeeList.isDisplayed())
	    {
	    	topNavImpl.clickHffLogo();
	    }
		clickDonorCustomerCenter();
		if(donorCustomerCenterList.isDisplayed())
		{
			topNavImpl.clickHffLogo();
		}
		clickBankCenter();
		if(bankList.isDisplayed())
		{
			topNavImpl.clickHffLogo();
		}
		clickOrganizationCenter();
		if(glAccountList.isDisplayed())
		{
			topNavImpl.clickHffLogo();
		}
		clickReportsCenter();
		if(report.isDisplayed())
		{
			topNavImpl.clickHffLogo();
		}
	}
}
