package handleselenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {

		
		@Test
		public void titleTest() {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.selenium.dev/");
		
		WebElement ele=driver.findElement(By.linkText("Downloads"));
		String elename=ele.getText();
		System.out.println(elename);
	
		String actual_title=driver.getTitle();
		String expected_title="SeleniumHQ Browser Automation";
		
		Assert.assertTrue(actual_title.contains(expected_title));
		
		
		
		
		
	}

}
