package testNGClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.ConfigReader;

public class VerifyTitle {

	
	WebDriver driver;
	ConfigReader config;
	

	@Test
	public void setup() {
		
		config= new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getchromepath());
		driver=new ChromeDriver();
		System.out.println("System Loading successful......");
		
	}	
	
	@Test
	public void verifytitle() {
		
		driver.get("https://stackoverflow.com/");
		String actual_title=driver.getTitle();
		String expected_titile="Stack Overflow ";
		
		Assert.assertTrue(actual_title.contains(expected_titile));
		
		System.out.println("Page Verified..........");
		
	}
		
		
}
