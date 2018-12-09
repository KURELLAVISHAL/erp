package com.erp.main.pages;

import env.BaseTest;

public interface AddBankDetailsPage extends BaseTest
{
	public void enterBankAccountNumber(String x);
	public void selectBankAccountType(String text);
	public void enterIfscCode(String x);
	public void enterNameAsPerBankRecord(String x);
	
}
