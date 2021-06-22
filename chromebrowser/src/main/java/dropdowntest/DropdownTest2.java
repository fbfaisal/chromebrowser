package dropdowntest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest2 {

	@Test
	public void dropdowntest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		
		WebElement country_dropdown=driver.findElement(By.id("countries"));
		
		Select country_DDL=new Select(country_dropdown);
		country_DDL.selectByVisibleText("Bangladesh");
		
		WebElement year_dropdown=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select year_dd= new Select(year_dropdown);
		
		year_dd.selectByVisibleText("1983");
		
	}
	
	
	
}
