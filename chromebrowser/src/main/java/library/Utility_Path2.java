package library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class Utility_Path2 {
	
	
	
	public static String CaptureScreenshot(WebDriver driver,String screenshotname) {
		
		
	
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			 String path = System.getProperty("user.dir") + "/ScreenShot/" + screenshotname + ".png";
		        
			File destination=new File(path);
			
			try {
			
			FileHandler.copy(source, destination);
			} 
			
			catch (IOException e) {
			
			System.out.println("Capture Failed"+e.getMessage());
				
		    }
			return path; 

	
		
	}
	
	
	

}
