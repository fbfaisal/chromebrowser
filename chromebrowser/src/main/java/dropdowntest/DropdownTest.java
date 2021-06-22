package dropdowntest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class DropdownTest {
	
	
	@Test
	public void selectDDV(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		

		WebElement month_dropdown=driver.findElement(By.id("month"));
		
		Select month_DD=new Select(month_dropdown);
		
		month_DD.selectByVisibleText("Sep");
	
		
	
		
		
		
		
	}
	
	
	
	
	
	
}
