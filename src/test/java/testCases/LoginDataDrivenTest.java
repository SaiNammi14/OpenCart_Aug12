package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class LoginDataDrivenTest extends BaseClass{
	//here DataProviders is java class which is in utilities
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	void test_loginDataDriven(String email1,String pwd1,String exp)
	{
		logger.info("****Starting Data Driven Test*****");
		try
		{	
		HomePage hp1=new HomePage(driver);
		hp1.clickMyAcc();
		hp1.clickLogin();
		
		LoginPage lp1=new LoginPage(driver);
		lp1.setLoginEmail(email1);
		lp1.setLoginPWD(pwd1);
		lp1.ClickLogin();
		
		MyAccountPage ap1=new MyAccountPage(driver);
		boolean heading=ap1.isHeadingDisplayed();
		if(exp.equals("valid"))
		{
			if(heading==true)
			{
				ap1.clkLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		if(exp.equals("Invalid"))
		{
			if(heading==true)
			{
				
				ap1.clkLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("Finished Data Driven Test");
	}
}
