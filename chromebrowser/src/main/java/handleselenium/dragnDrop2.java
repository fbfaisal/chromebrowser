package handleselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragnDrop2 {
	
	@Test
	public void dragndrop2() throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
		
		Actions act=new Actions(driver);
		
	
		WebElement source=driver.findElement(By.xpath("//span[contains(text(),'Nancy Atherton')]"));
		WebElement destination=driver.findElement(By.xpath("//li[contains(text(),'Zend Framework in Action')]"));
		
		
		act.clickAndHold(source)
		.pause(Duration.ofSeconds(2))
		.moveToElement(destination)
		.pause(Duration.ofSeconds (2))
		.release()
		.build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
