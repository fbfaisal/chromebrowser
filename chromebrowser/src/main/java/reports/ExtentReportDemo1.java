package reports;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo1 {
	
	@Test
	public void logintest() throws Exception{
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Fahad");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/facebook.html");
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger=extent.createTest("Login Test");
		
		logger.log(Status.INFO, "login to facebook");
		
		logger.log(Status.PASS, "title verified");
		
		logger.fail("Failed due to ivalid credentials", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\fbfai\\Desktop\\Screenshot Automtion\\Screenshot (37).png").build());
	        
		extent.flush();
		
		
		ExtentTest logger2=extent.createTest("Quit Test");
		
		driver.quit();
		logger2.log(Status.INFO, "Quit working");

		extent.flush();
		
		
	}

}
