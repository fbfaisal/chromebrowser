package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.classfile.Utility;

public class FacebookSignup {

	@Test
	public void signup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ahamd");
	
	
		WebElement birth_m=driver.findElement(By.xpath("//select[@id='month']"));
		Select b_month=new Select(birth_m);
		b_month.selectByIndex(9);
		
		WebElement birth_d=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select b_day=new Select(birth_d);
		b_day.selectByVisibleText("12");
		
		WebElement birth_y=driver.findElement(By.xpath("//select[@id='year']"));
		Select b_year=new Select(birth_y);
		b_year.selectByVisibleText("1983");
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		
	}
	
}
