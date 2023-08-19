package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Elements :
	@FindBy(xpath="//input[@id='input-firstname']") WebElement Fname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement Lname;
	@FindBy(xpath="//input[@id='input-email']") WebElement Email;
	@FindBy(xpath="//input[@id='input-password']") WebElement Pwd;
	@FindBy(xpath="//input[@name='agree']") WebElement chkBox;
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement cntButton;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement Confirmationmsg;
	
	//Action Methods
	public void SetFname(String fname)
	{
		Fname.sendKeys(fname);
	}
	
	public void SetLname(String lname)
	{
		Lname.sendKeys(lname);
	}
	
	public void SetEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void SetPwd(String pwd)
	{
		Pwd.sendKeys(pwd);
	}
	
	public void clickChkbox()
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();",chkBox );
		//chkBox.click();
	}
	
	public void clickCntButton() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();",cntButton);
		//cntButton.click();
		
	}
	
	public String getConfirmmsg()
	{
		try {
			return (Confirmationmsg.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}

}
