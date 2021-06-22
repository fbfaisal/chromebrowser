package handleselenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupHandle {
	
	
	@Test
	public void popuphandle() throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.manage().window().maximize();
		
		
		Set<String> allwindow=driver.getWindowHandles();
		
		for(String child : allwindow) {
			
			if(!parent.equalsIgnoreCase(child)) {
				
				driver.switchTo().window(child);
				
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
			
			
		}
		
		driver.switchTo().window(parent);
		
	
		
		
		
		
		
		
	}
	

}
