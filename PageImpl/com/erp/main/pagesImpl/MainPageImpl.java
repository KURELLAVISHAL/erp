package com.erp.main.pagesImpl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.erp.main.pages.MainPage;

import env.Env;
import methods.ExplicitWaitMethods;



public class MainPageImpl extends Env implements MainPage
{
	
	@FindBy(xpath="//*[@name='search']")
	public WebElement search;
	
	@FindBy(xpath="//*[@class='btn btn-primary m-t-15 waves-effect associatesave']")
	public WebElement add;
	
	@FindBy(xpath="//*[@id='myClickDisabledElm']")
	public WebElement save;
	
	@FindBy(xpath="//tbody")
	public List<WebElement> tbody;
	
	public MainPageImpl(WebDriver x)
	{
		x=Env.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	public  String getTableData(int tableBody,int tableRow,int tableData)
	{
		
		
		List<WebElement> x=tbody.get(tableBody).findElements(By.xpath("//tr"));
		List<WebElement> y=x.get(tableRow).findElements(By.xpath("//td"));
		String z=y.get(tableData).getText();
		System.out.println(z);
		return z;
	}

	@Override
	public void searchText(String x) {
		// TODO Auto-generated method stub
		inputObj.enterText(search, x);
	}
	
	

	@Override
	public void clickAdd() {
		// TODO Auto-generated method stub
		System.out.println("clickAdd() method impl");
//		clickObj.click(add);
		add.click();
		
	}
	
	public void clickView(int z)
	{
		
		List<WebElement> eye=driver.findElements(By.xpath("//*[@class='fa fa-eye fa-rotate-45']"));
		eye.get(z).click();
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		clickObj.click(save);
	}

	
}
