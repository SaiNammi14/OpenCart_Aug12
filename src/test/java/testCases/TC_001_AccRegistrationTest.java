package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
/*
 * Logs :
 * -----
 * logging different events/logs to this.
 * If we execute testcases , sometimes they will pass/fail . so to record that fail/pass counts we use this logs
 * it will have all the history.
 */
public class TC_001_AccRegistrationTest extends BaseClass{
   
    @Test(groups= {"Regression","Master"})
    void test_account_Reg() throws InterruptedException
    {
    	logger.info("*****  Staring TC_001_AccRegTest  *****");
    	try {
    	HomePage hp=new HomePage(driver);
    	logger.info("Clicked on MyAccount");
    	hp.clickMyAcc();
    	logger.info("Clicked on Register");
    	hp.ClickLinkReg();
    	
    	
    	AccountRegistrationPage Arp=new AccountRegistrationPage(driver);
    	logger.info("Providing Customer Data");
    	Arp.SetFname("Abc");
    	Arp.SetLname("xyz");
    	//Arp.SetEmail("acvfff@gmail.com");//randomaly generated
    	//How to generate random data 
    	Arp.SetEmail(randomeString()+"@gmail.com");
    	Arp.SetPwd("12345678");
    	Arp.clickChkbox();
    	logger.info("Clicked On Continue");
    	Arp.clickCntButton();
    	
    	String msg=Arp.getConfirmmsg();
    	logger.info("Validating the Expected Message");
    	Assert.assertEquals(msg,"Your Account Has Been Created!","Not Getting Expected Message");
    	}
    	catch(Exception e)
    	{
    		logger.info("Test Failed");
    		Assert.fail();
    	}
    	logger.info("Finished TC_001_AccRegTest");
    }
    
   
}
