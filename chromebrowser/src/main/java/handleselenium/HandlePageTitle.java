package handleselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlePageTitle {
	
	
	@Test
	public void verifypagetitle() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://learn-automation.com/");
		String actual_title=driver.getTitle();
		String expected_title= "Selenium WebDriver tutorial Step by Step";
		
		System.out.println(actual_title);
		Assert.assertTrue(actual_title.contains(expected_title));
		System.out.println("Page Verified");
		
		Utility.CaptureScreenshot(driver, expected_title);
		
		
		
		
		
		
		
		
		
	}
	

}
