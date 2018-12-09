package com.erp.main.pages;



import env.BaseTest;

public interface MainPage extends BaseTest
{
	
	public void searchText(String x);
	public void clickAdd();
	public void save();
	public String getTableData(int tableBody,int tableRow,int tableData);
	public void clickView(int tableBody);
}
