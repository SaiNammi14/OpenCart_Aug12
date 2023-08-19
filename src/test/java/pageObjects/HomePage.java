package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Elements 
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement LinkMyAcc;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement linkRegister;
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement Login;
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
	//Action Methods 
	public void clickMyAcc()
	{
		jse.executeScript("arguments[0].click();", LinkMyAcc);
		//LinkMyAcc.click();
	}
	public void ClickLinkReg()
	{
		jse.executeScript("arguments[0].click();", linkRegister);
		//linkRegister.click();
	}
	public void clickLogin()
	{
		Login.click();
	}

	
}
