package handleselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class CromeOption {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
	
		//how to handle untrusted certificate
		//plesae avoid the class name
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver=new ChromeDriver(cap);
		
		driver.get("https://cacert.org");
		
		
	}

}
