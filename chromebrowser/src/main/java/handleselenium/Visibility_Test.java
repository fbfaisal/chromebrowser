package handleselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Visibility_Test {
	
	@Test
	public void Test() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	WebElement element=driver.findElement(By.name("q"));
	
	boolean status=element.isDisplayed();
	
	if(status) {
		
		System.out.println("Element is displayed");
	}
	else
		System.out.println("Element is not displayed");
	
	
	Assert.assertTrue(element.isDisplayed());
	
	
	}
}
