package methods;

import env.BaseTest;
import env.Env;

public class JavascriptHandlingMethods implements BaseTest 
{
	/**Method to handle alert
	 * @param decision : String : Accept or dismiss alert
	 */
	public void handleAlert(String decision)
	{
		if(decision.equals("accept"))
			Env.getDriver().switchTo().alert().accept();
		else
			Env.getDriver().switchTo().alert().dismiss();
	}
}
