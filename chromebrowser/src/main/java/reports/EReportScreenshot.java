package reports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import handleselenium.Utility;

public class EReportScreenshot {

	
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/facebooklog.html");
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	logger=extent.createTest("Login Test");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();		
		
	}
	
	@Test
	public void facebooklogin() {
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Fad");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println(driver.getTitle());
		logger.log(Status.INFO, "Logininfo");
		Assert.assertTrue(driver.getTitle().contains("fahad"));	
		
	}
	
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException, InterruptedException {
	
	if(result.getStatus()==ITestResult.FAILURE) {
		
	String temp=Utility_Path2.CaptureScreenshot(driver, "facebooklog");
	Thread.sleep(2000);
	logger.fail("Failed due to ivalid credentials", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
	}
	extent.flush();
		
	}
	
	
}
