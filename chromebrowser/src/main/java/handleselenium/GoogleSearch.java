package handleselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {
	
	@Test
	public void method() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	
	driver.findElement(By.name("q")).sendKeys("nvidia");
	List <WebElement> list=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
	
	for(WebElement ele: list) {
		
		
	String name=ele.getText();
	System.out.println(name);
	if(name.equalsIgnoreCase("nvidia gaugan")) {
		
		ele.click();
		break;
		
	}
	}
	
	
	
	
	
		
		
	}
	

}
