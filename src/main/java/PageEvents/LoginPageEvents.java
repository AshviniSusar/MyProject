package PageEvents;


import org.testng.Assert;

import PageObjects.LoginPageElements;
import Utils.ElementFetch;
public class LoginPageEvents {
	
	ElementFetch ele = new ElementFetch();

	public void verifyIfLoginPageIsloaded() 
	{

		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.LoginText).size()>0,"Element not found");
	}
	public void enterCredentials()
	{
		ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("ashu@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("secure123");

	}
	
	
}
