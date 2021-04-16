package testNGClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import library.ConfigReader;

public class MethodDependency {
	
	WebDriver driver;
	ConfigReader config;
	

	@Test
	public void setup() {
		
		config= new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getchromepath());
		driver=new ChromeDriver();
		System.out.println("System Loading successful......");
		
	}

	@Test(dependsOnMethods = "setup")
	public void startup() throws InterruptedException {
		
		driver.get(config.getURL());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.id("logInPanelHeading")).isDisplayed());
		System.out.println("Application Loading successful.......");
			
	}
	
	@Test(dependsOnMethods = "startup")
	public void login() throws Exception {
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).isDisplayed(),"<========XPATH BROKEN=====>");

	
	
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() throws Exception {
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(" //a[contains(text(),'Logout')]")).click();
		Assert.assertTrue(driver.findElement(By.id("logInPanelHeading")).isDisplayed());
		System.out.println("logout successful............");
		
	}

	@AfterClass
	public void quit() {
		System.out.println("Driver quit........");
		driver.quit();

		
	}
}

