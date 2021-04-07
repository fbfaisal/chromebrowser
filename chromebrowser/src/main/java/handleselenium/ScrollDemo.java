package handleselenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollDemo {

	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://learn-automation.com/find-broken-links-using-selenium/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		  ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
	}

}
