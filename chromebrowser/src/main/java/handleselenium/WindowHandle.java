package handleselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//*[contains(@href,'www.google.com')]")).click();
		Set<String> allwindow=driver.getWindowHandles();
		
		for(String child : allwindow) {
			
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				driver.findElement(By.name("q")).sendKeys("syed mukit");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@name='btnK']")).click();
				driver.close();	
			
				
			}
		
		}
		
		driver.switchTo().window(parent);
		
		
		
		
		
		
		
		
		
		
		

	}

}
