package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	@Test(groups= {"Sanity","Master"})
	public void test_login()
	{
		try
		{
		logger.info("***** Starting TC_002_Login_Test******");
		HomePage hp=new HomePage(driver);
		hp.clickMyAcc();
		hp.clickLogin();
		LoginPage lp=new LoginPage(driver);
		lp.setLoginEmail(rb.getString("email"));// valid email ,we are getting from config.properties file
		lp.setLoginPWD(rb.getString("password"));//valid pwd ,we are getting from config.properties file
		lp.ClickLogin();
		MyAccountPage ap=new MyAccountPage(driver);
		boolean heading=ap.isHeadingDisplayed();
		Assert.assertEquals(heading,true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("Finished TC_002_Login_Test");
	}
}
