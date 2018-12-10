package managers;

import static env.BaseTest.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.erp.AssociateCenter.pagesImpl.DashboardPageImpl;
import com.erp.AssociateCenter.pagesImpl.EmployeePageImpl;
import com.erp.main.pagesImpl.AddAddressDetailsPageImpl;
import com.erp.main.pagesImpl.AddBankDetailsPageImpl;
import com.erp.main.pagesImpl.AddCardDetailsPageImpl;
import com.erp.main.pagesImpl.AddUserDetailsPageImpl;
import com.erp.main.pagesImpl.LoginPageImpl;
import com.erp.main.pagesImpl.MainPageImpl;
import com.erp.main.pagesImpl.TopNavImpl;

import env.Env;

public class PageObjectManager extends Env
{
	private TopNavImpl topNavImpl;
	private MainPageImpl mainPageImpl;
	private LoginPageImpl loginPageImpl;
	private AddUserDetailsPageImpl addUserDetailsPageImpl;
	private AddCardDetailsPageImpl addCardDetailsPageImpl;
	private AddBankDetailsPageImpl addBankDetailsPageImpl;
	private AddAddressDetailsPageImpl addAddressDetailsPageImpl;
	private DashboardPageImpl dashboardPageImpl;
	private EmployeePageImpl employeePageImpl;
	
	
	
	public PageObjectManager(WebDriver x)
	{
		x=Env.getDriver();
		PageFactory.initElements(x, this);
	}
	
	public TopNavImpl getTopNavImpl()
	{
		return (topNavImpl==null)?topNavImpl= new TopNavImpl(getDriver()) : topNavImpl;
	}
	
	public MainPageImpl getMainPageImpl()
	{
		return (mainPageImpl==null)?mainPageImpl= new MainPageImpl(getDriver()) : mainPageImpl;
	}
	
	public LoginPageImpl getLoginPageImpl()
	{
		return (loginPageImpl==null)?loginPageImpl= new LoginPageImpl(getDriver()) : loginPageImpl;
	}
	
	public AddUserDetailsPageImpl getAddUserDetailsPageImpl()
	{
		return (addUserDetailsPageImpl==null)?addUserDetailsPageImpl= new AddUserDetailsPageImpl(getDriver()) : addUserDetailsPageImpl;
	}
	
	public AddCardDetailsPageImpl getAddCardDetailsPageImpl()
	{
		return (addCardDetailsPageImpl==null)?addCardDetailsPageImpl= new AddCardDetailsPageImpl(getDriver()) : addCardDetailsPageImpl;
	}
	
	public AddBankDetailsPageImpl getAddBankDetailsPageImpl()
	{
		return (addBankDetailsPageImpl==null)?addBankDetailsPageImpl= new AddBankDetailsPageImpl(getDriver()) : addBankDetailsPageImpl;
	}
	
	public AddAddressDetailsPageImpl getAddAddressDetailsPageImpl()
	{
		return (addAddressDetailsPageImpl==null)?addAddressDetailsPageImpl= new AddAddressDetailsPageImpl(getDriver()) : addAddressDetailsPageImpl;
	}
	
	public DashboardPageImpl getDashboardPageImpl()
	{
		return (dashboardPageImpl==null)?dashboardPageImpl= new DashboardPageImpl(getDriver()) : dashboardPageImpl;
	}
	
	public EmployeePageImpl getEmployeePageImpl()
	{
		return (employeePageImpl==null)?employeePageImpl= new EmployeePageImpl(getDriver()) : employeePageImpl;
	}
	
}
