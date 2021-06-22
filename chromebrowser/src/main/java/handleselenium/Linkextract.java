package handleselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Linkextract {


	@Test
	public void titleTest() {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.get("https://www.selenium.dev/");
	
	
	
	List<WebElement> link=driver.findElements(By.tagName("a"));
	
	for(WebElement ele: link) {
		
		System.out.println(ele.getText());
		
		
	}
	
	System.out.println("Total number of Link----"+link.size());
}
}