package com.erp.main.pages;

import java.io.IOException;

import env.BaseTest;

public interface LoginPage extends BaseTest
{
	public void fillUserId(String x);
	public void fillpwd(String x);
	public void clickLoginBtn();
	public void login();
	public void validatePwdFields(String x) throws IOException;
}
