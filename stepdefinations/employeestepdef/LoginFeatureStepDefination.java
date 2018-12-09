package employeestepdef;

import com.erp.main.pages.LoginPage;
import com.erp.main.pages.TopNav;
import com.erp.main.pagesImpl.LoginPageImpl;
import com.erp.main.pagesImpl.TopNavImpl;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import env.Env;
import managers.TestContext;

public class LoginFeatureStepDefination extends Env
{
	TestContext testContext;
	LoginPageImpl loginPageImpl;
	TopNavImpl topNavImpl;
	
	public LoginFeatureStepDefination(TestContext context) {
		 testContext = context;
		 loginPageImpl = testContext.getPageObjectManager().getLoginPageImpl();
		 topNavImpl=testContext.getPageObjectManager().getTopNavImpl();
		 }
	
	@Then("^enter userid with \"(.*)\"$")
	public void enterUserId(String x)
	{
		loginPageImpl.fillUserId(x);
	}
	

	@Then("^enter password with \"(.*)\"$")
	public void enterpwd(String x)
	{
		loginPageImpl.fillpwd(x);		
	}

	@And("^click on login button$")

	public void clickLogin() throws Exception
	{
		loginPageImpl.clickLoginBtn();	
	}
	
	@Then("^click on logout$")
	public void clicklogout()
	{
		
		topNavImpl.clickLogout();
	}
	
	@Then("^click on profile$")
	public void clickOk()
	{
		
		topNavImpl.clickProfile();
	}
	
	@Then("^validate userid and password fields with \"(.*)\"$")
	public void validateUserPwdFields(String x) throws Exception
	{
		
		loginPageImpl.validatePwdFields(x);
		
	}
	
}
