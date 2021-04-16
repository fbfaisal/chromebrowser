package crossbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class VerifyTitle {

	WebDriver driver;
	
	@Test
	@Parameters("Browser")
	public  void test1(String browsername) {
	 
	if(browsername.equalsIgnoreCase("chrome")){
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
	driver=new ChromeDriver();
	 

	 
	}
	else if(browsername.equalsIgnoreCase("IE")){
	 
	System.setProperty("webdriver.ie.driver", "C:\\Users\\fbfai\\Desktop\\D\\Drivers\\IE Browser\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
	
	driver=new InternetExplorerDriver();	
	
	}
	
	
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	driver.quit();
	
	}
	 
	
	
}
