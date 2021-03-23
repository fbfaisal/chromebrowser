package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookSignup {

	@Test
	public void signup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ahamd");
		
		WebElement birth_m=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select b_month=new Select(birth_m);
		b_month.selectByIndex(10);
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		
	}
	
}
