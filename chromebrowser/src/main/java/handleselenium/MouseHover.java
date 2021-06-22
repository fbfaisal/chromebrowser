package handleselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	
	
	@Test
	public void mousehoverdemo() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//button[text()='Automation Tools']"))).perform();
		//List<WebElement> list=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='dropdown']/div/a"));
		
		for(WebElement ele : list) {
			
		String linkname=ele.getAttribute("innerHTML");
		
	
		if(linkname.equalsIgnoreCase("appium")) {
			
			ele.click();
			break;
			
		
		}
		
		}
		
		
		
		
		
		
		
		
	}

}
