package handleselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboadActionDemo {

	public static void main(String[] args) throws Exception {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
		
		act.sendKeys(Keys.TAB)
		.sendKeys("LLLLL")
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.sendKeys("12345678")
		.pause(Duration.ofSeconds(2))
		.build()
		.perform();
		
	}

}
