package employeestepdef;

import com.erp.AssociateCenter.pages.EmployeePage;
import com.erp.AssociateCenter.pagesImpl.EmployeePageImpl;
import com.erp.main.pages.LoginPage;
import com.erp.main.pagesImpl.LoginPageImpl;

import cucumber.api.java.en.Then;
import env.Env;
import managers.TestContext;
import pages.AssociateCenterModule;

public class EmployeeStepDefination extends Env
{
	TestContext testContext;
	AssociateCenterModule m=new AssociateCenterModule(getDriver());
	LoginPageImpl loginPageImpl;
	EmployeePageImpl employeePageImpl;
	
	public EmployeeStepDefination(TestContext context) {
		 testContext = context;
		 loginPageImpl = testContext.getPageObjectManager().getLoginPageImpl();
		 employeePageImpl=testContext.getPageObjectManager().getEmployeePageImpl();
		 }
	
	
	@Then("^navigate to \"([^\"]*)\"$")
	public void navigate_to(String link)
	{
		
		getDriver().get(link);
	}
	
	
	@Then("^click on associate center$")
	public void clickLanguageSubModule()
	{
		
		m.clickAssociateCenter();
	}
	
	@Then("^click on master data$")
	public void clickCitySubModule()
	{
		m.clickMasterDataEmployee();
	}	
	
	@Then("^login with valid credentials$")
	public void login_with_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPageImpl.login();
	}

	@Then("^click on employee$")
	public void click_on_employee() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		m.clickMasterDataEmployee();
	}

	@Then("^enter all mandatory fields and click save$")
	public void enter_all_mandatory_fields_and_click_save() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		employeePageImpl.addEmployee();
	}
	
	@Then("^check employee name is employee list$")
	public void check_employee_name_is_employee_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    employeePageImpl.checkEmployeeList();
	}
	
	@Then("^enter the data in search and check whether the data is reflecting or not$")
	public void enter_the_data_in_search_and_check_whether_the_data_is_reflecting_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		employeePageImpl.checkSearchList();
	}
	
	@Then("^click view then check the details$")
	public void click_view_then_check_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		employeePageImpl.clickView();
	}
}
