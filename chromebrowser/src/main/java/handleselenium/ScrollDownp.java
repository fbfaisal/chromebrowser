package handleselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDownp {
	
	@Test
	public void scrolldown3() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://learn-automation.com/about-me/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement element=driver.findElement(By.xpath("//a[@href='https://www.facebook.com/SeleniumWebdriverMukesh']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
		
		System.out.println(element.getText());
		
	}

}
