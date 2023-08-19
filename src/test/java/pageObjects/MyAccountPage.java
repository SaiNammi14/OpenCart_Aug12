package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement Headingmsg;//my account heading
    @FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Logout']") WebElement Logout;
    
	public boolean isHeadingDisplayed()
	{
		try {
			return (Headingmsg.isDisplayed()); //my account heading displayed or not
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void clkLogout()
	{
		//Logout.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();",Logout);
	}
}
