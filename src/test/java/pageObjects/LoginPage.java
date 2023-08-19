package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
    //Elements 
	@FindBy(xpath="//input[@id='input-email']") WebElement LoginEmail;
	@FindBy(xpath="//input[@id='input-password']") WebElement Loginpwd;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement Loginbtn;
	
	public void setLoginEmail(String logemail)
	{
		LoginEmail.sendKeys(logemail);
	}
	
	public void setLoginPWD(String logpwd)
	{
		Loginpwd.sendKeys(logpwd);
	}
	public void ClickLogin()
	{
		Loginbtn.click();
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("arguments[0].click();",Loginbtn);
	}
	
}
