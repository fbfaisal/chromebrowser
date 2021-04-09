package handleselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.ConfigReader;

public class ConfigTestData2 {
	
	ConfigReader config;
	
	@BeforeTest
	public void setup() {
		
	config=new ConfigReader();
	System.setProperty("webdriver.chrome.driver",config.getchromepath());	
		
	}
	
	
	@Test
	public void testchrome() {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get(config.getURL());
	driver.manage().window().maximize();
	
	
	
	
	
}
}