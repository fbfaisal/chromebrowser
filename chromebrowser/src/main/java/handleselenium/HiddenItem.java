package handleselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenItem {
	
	@Test
	public static void hiddenitemhelp() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@id='male']"));
		
		for(WebElement ele : list) {
			
			
		int x=ele.getLocation().getX();
		
		if(x!=0) {
			
			
			ele.click();
			
		}
		
		}
	}
	
	

}
