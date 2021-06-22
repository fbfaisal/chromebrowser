package handleselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Enable_Select {

	
	@Test
	public void Test() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	
	driver.get("https://login.yahoo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement element=driver.findElement(By.xpath("//input[@type='checkbox' and @name='persistent']"));
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click()",element);
	
	Thread.sleep(5000);
	
	boolean status=element.isSelected();
	
	if(status) {
		
		System.out.println("selected");
	}
	
	else
		System.out.println("not selected");
	

	}
}
