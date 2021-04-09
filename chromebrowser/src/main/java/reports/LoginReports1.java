package reports;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginReports1 {
	
	
	

	@Test
	public void loginTest() throws IOException
	{    
          
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/amazon.html");
		
	    ExtentReports extent = new ExtentReports();
	    
	    extent.attachReporter(reporter);
	    
            
	    ExtentTest logger=extent.createTest("LoginTest");
	    
        
	    logger.log(Status.INFO, "Login to amazon");
	   
	    logger.log(Status.PASS, "Title verified");
	    logger.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/fbfai/Desktop/Screenshot Automtion/passlogo.jpg").build());
            
	    extent.flush();
		
	    ExtentTest logger2=extent.createTest("Logoff Test");
	    
	    logger2.log(Status.FAIL, "Title verified");
	    
	    logger2.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/fbfai/Desktop/Screenshot Automtion/faillogo.jpg").build());
        
         
	    extent.flush();
	    	
	}
	

}
