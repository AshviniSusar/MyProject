package qa.Test;

import org.testng.annotations.Test;
import PageEvents.LoginPageEvents;
import Base.BaseTest;
import PageEvents.HomePageEvents;
import Utils.ElementFetch;
public class Testcase1 extends BaseTest{
	ElementFetch ele = new ElementFetch();
	HomePageEvents homepage = new HomePageEvents();
	LoginPageEvents LoginPage = new LoginPageEvents();
  @Test
  public void sampleMethodForEnteringCredentials() {
	  logger.info("Signin into LoginPage");
	  homepage.signInButton();
	  logger.info("Verifing if login test is present or not");
	  LoginPage.verifyIfLoginPageIsloaded();
	  logger.info("Enter the Credentials");
	  LoginPage.enterCredentials();
  }
}
