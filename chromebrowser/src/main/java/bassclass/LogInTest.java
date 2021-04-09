package bassclass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogInTest extends BaseClass{

	@Test
	public void applogin() throws Exception {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
	}
	
	@Test
	public void applogin2() throws Exception {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("mm");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	
	
	
}
