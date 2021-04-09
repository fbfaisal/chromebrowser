package bassclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import library.ConfigReader;

public class BaseClass {
	
	                //we can use BeforeClass and AfterClass for single time window open with multiple testcase
	
	WebDriver driver;
	@BeforeMethod                     
	public void setupapplication() {
		
		ConfigReader config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getchromepath());
		driver=new ChromeDriver();
		Reporter.log("====Application Atarted=====",true);
		
	}

	@AfterMethod
	public void closeapplication() {
		
		driver.quit();
		Reporter.log("=====Application Closed=====",true);
		
	}
	
	
	
	
}
