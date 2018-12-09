package managers;

import env.Env;

public class TestContext 
{
	private PageObjectManager  pageObjectManager;
	 
	 public TestContext(){
	 
	 pageObjectManager = new PageObjectManager(Env.getDriver());
	 }

	 
	 public PageObjectManager getPageObjectManager() {
	 return pageObjectManager;
	 }
}
