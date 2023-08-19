package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
/*
 * it contains re-usable methods
 */
public class BaseClass {
     public static WebDriver driver;
     public Logger logger;//for logging
     
     public ResourceBundle rb;//for config.properties
	@BeforeClass(groups= {"Master","Sanity","Regression"})
	@Parameters("browser")
	public void setup(String br) throws InterruptedException
	{
		rb=ResourceBundle.getBundle("config");//load config.properties file
		logger=LogManager.getLogger(this.getClass());//for logging
		if(br.equals("chrome"))
		{
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
			driver= new ChromeDriver(options);
		}
		else if(br.equals("edge"))
		{
			EdgeOptions options = new EdgeOptions();
			 options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options);
		}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.get("http://localhost/opencart/upload/");
			driver.get(rb.getString("appURL"));//config.properties 
			driver.manage().window().maximize();
			//Thread.sleep(3000);
	}	 
	@AfterClass(groups= {"Master","Sanity","Regression"})
   public void tearDown()
	{
	    driver.quit();	
	}
	//We can generate random numbers and strings
	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}
	public String randomeNumber()
	{
		String generatedString1=RandomStringUtils.randomNumeric(10);
		return (generatedString1);
	}
	public String randomeAlphaNumeric()
	{
		String str1=RandomStringUtils.randomAlphabetic(7);
		String num=RandomStringUtils.randomNumeric(10);
		return (str1+num);
	}
	
	public String captureScreen(String tname) throws IOException{
		/*SimpleDateFormat df=new SimpleDateFormat("yyyyMMddhhmmss");
		Date dt=new Date();
		String timestamp=df.format(dt);*/
		//by combinig all the above 3 statements writing below one.
		
		String timeStamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
		File source=takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

		
		
	}
	
	
}
