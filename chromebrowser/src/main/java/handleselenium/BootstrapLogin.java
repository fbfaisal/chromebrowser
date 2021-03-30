package handleselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapLogin {
	
	@Test
	public void bootstraplogin() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://goibibo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("get_sign_up")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456");
		
		
		
		
		
		
	}
	
	
	

}
