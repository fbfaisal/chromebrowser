package handleselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CapturingErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div/button")).click();
		Utility.CaptureScreenshot(driver, "gmail");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		String actual_error=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();

		String expected_error="Enter an email or phone number";
		
		Assert.assertTrue(actual_error.contains(expected_error));
		
		System.out.println("YAY!! Test Passed");
	}

}
