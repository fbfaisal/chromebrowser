package dropdowntest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class FbTest_IV {
	
	@Test
	public void fbSignup() throws InterruptedException{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	driver.manage().window().maximize();
	
	List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	
	for(WebElement ele:radio) {
		
		String value=ele.getAttribute("value");
		System.out.println(value);
		
		if(value.equalsIgnoreCase("ruby")) {
			
			ele.click();
		}
	}
	
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
	
	for(WebElement ele:checkbox) {
		
		String att=ele.getAttribute("id");
		
		System.out.println(att);
		
		if (att.equalsIgnoreCase("sing"))
			ele.click();
	}

	
	}

}
