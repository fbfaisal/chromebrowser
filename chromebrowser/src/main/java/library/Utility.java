package library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
	
	public static void CaptureScreenshot(WebDriver driver,String screenshotname) {
		
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./ScreenShot/"+screenshotname+".png"));
			System.out.println("ScreenShot Taken");
		} catch (Exception e) {
			System.out.println("Exception while taking Screenshot"+e.getMessage());
		} 

	
		
	}
	
	
	
	
	
	

}
