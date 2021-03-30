package dropdowntest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import handleselenium.Utility;

public class BootstrapTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("menu1")).click();
		
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
	
		for(WebElement ele : menu) {
			
		String inner_html=ele.getAttribute("innerHTML");
		if(inner_html.equals("JavaScript")) {
			
			ele.click();
			break;
		}
			
		}
		
	
		
		
		
	}

}
