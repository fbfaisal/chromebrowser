package handleselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTitlefromPageSource {
	
	@Test
	public void verifytitle() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://learn-automation.com/");
	String page_source=driver.getPageSource();
	String title="Automation - Selenium WebDriver tutorial Step by Step";
	
	Assert.assertTrue(page_source.contains(title));
	System.out.println("page verified");
	
	
	
	
	
	}	
	
}
