package dropdowntest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownAssending {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		driver.manage().window().maximize();
		
		WebElement tools1=driver.findElement(By.id("tools"));
		
		Select tools=new Select(tools1);
		
		List actual_list=new ArrayList();
		List<WebElement> mytools=tools.getOptions();
	
		for(WebElement ele:mytools) {
			
			String value=ele.getText();
			actual_list.add(value);
			System.out.println(actual_list);
		}
		
		List temp_list=new ArrayList();
		temp_list.add(actual_list);
		Collections.sort(temp_list);
		System.out.println(temp_list);
		
		Assert.assertTrue(actual_list.equals(temp_list));
	}

}
