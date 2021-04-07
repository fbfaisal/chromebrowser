package handleselenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {

	
	private static Logger logger=LogManager.getLogger(Log4jdemo.class);
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.info("Chrome Browser Operned");
		
		driver.get("https://www.naukri.com");
		logger.error("Application Launched");
		
		driver.manage().window().maximize();
		logger.info("window Maximized");
	



	}

}
