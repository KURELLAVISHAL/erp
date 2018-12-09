package com.erp.AssociateCenter.pagesImpl;


import static env.BaseTest.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.erp.AssociateCenter.pages.EmployeePage;
import com.erp.main.pages.AddAddressDetailsPage;
import com.erp.main.pages.AddBankDetailsPage;
import com.erp.main.pages.AddCardDetailsPage;
import com.erp.main.pages.AddUserDetailsPage;
import com.erp.main.pages.MainPage;
import com.erp.main.pagesImpl.AddAddressDetailsPageImpl;
import com.erp.main.pagesImpl.AddBankDetailsPageImpl;
import com.erp.main.pagesImpl.AddCardDetailsPageImpl;
import com.erp.main.pagesImpl.AddUserDetailsPageImpl;
import com.erp.main.pagesImpl.MainPageImpl;
import com.erp.main.pagesImpl.TopNavImpl;

import env.Env;
import managers.PageObjectManager;
import managers.TestContext;


public class EmployeePageImpl extends Env implements EmployeePage
{

	PageObjectManager pageObjectManager=new PageObjectManager(getDriver());
	AddAddressDetailsPageImpl addAddressDetailsPageImpl=pageObjectManager.getAddAddressDetailsPageImpl();
	AddCardDetailsPageImpl addCardDetailsPageImpl=pageObjectManager.getAddCardDetailsPageImpl();
	AddBankDetailsPageImpl addBankDetailsPageImpl=pageObjectManager.getAddBankDetailsPageImpl();
	AddUserDetailsPageImpl addUserDetailsPageImpl=pageObjectManager.getAddUserDetailsPageImpl();
	MainPageImpl mainPageImpl=pageObjectManager.getMainPageImpl();
	
	String x="shree";
	
	@FindBy(xpath="(//*[@id='emptype'])[1]")
	public WebElement empType;
	
	@FindBy(xpath="//*[text()='View Associate']")
	public WebElement viewEmployee;
	
	
	public EmployeePageImpl(WebDriver x)
	{
	
		x=Env.getDriver();
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@Override
	public void addEmployee() {

		// TODO Auto-generated method stub

		
		addUserDetailsPageImpl.enterName(x);
		inputObj.selectOptionFromDropDownByName(empType, "Employee");
		addUserDetailsPageImpl.enterDesignation("Sr developer");
		addUserDetailsPageImpl.enterDob("12121995");
		addUserDetailsPageImpl.enterJoiningDate("12042018");
		addUserDetailsPageImpl.enterMobileNo("9999999999");
		addUserDetailsPageImpl.enterEmail("suraj@gmail.com");
		addUserDetailsPageImpl.panNumber.clear();
		addUserDetailsPageImpl.enterPanNo("DCNPS7572L");
		addAddressDetailsPageImpl.enterPincode("500031");
		addAddressDetailsPageImpl.enterStreet("7-1-302");
		addBankDetailsPageImpl.inputObj.selectOptionFromDropDownByName(addBankDetailsPageImpl.bankAccountType, "Current");
		addBankDetailsPageImpl.enterBankAccountNumber("99999999999999999999");
		addBankDetailsPageImpl.enterIfscCode("ICIC0002360");
		addBankDetailsPageImpl.enterNameAsPerBankRecord("SURAJ");
		addCardDetailsPageImpl.enterCardNumber("9999999999");
		addCardDetailsPageImpl.inputObj.selectRadioButtonByText(addCardDetailsPageImpl.cardType, "Master");
		addCardDetailsPageImpl.enterValidityFrom("122018");
		addCardDetailsPageImpl.enterValidityTo("122022");
		mainPageImpl.save();
		
		
	}

	

	@Override
	public void checkEmployeeList() {
		// TODO Auto-generated method stub
		
		String y=mainPageImpl.getTableData(0, 0, 3);
		System.out.println("emp name is "+y);
		
		if(x.equals(y))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		
	}


	@Override
	public void checkSearchList() {
		// TODO Auto-generated method stub
		String name="sunil";
		mainPageImpl.searchText(name);
		String data=mainPageImpl.getTableData(0, 0, 3);
		if(name.equalsIgnoreCase(data))
		{
			System.out.println("test passed");
		}
		else 
		{
			System.out.println("test failed");
		}
		
	}


	@Override
	public void clickView() {
		// TODO Auto-generated method stub
		mainPageImpl.clickView(0);
		if(viewEmployee.isDisplayed())
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
	}

	

}
