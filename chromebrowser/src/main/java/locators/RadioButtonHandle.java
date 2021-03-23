package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandle {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		for(int i=0;i<radio.size();i++) {
			
		WebElement local_radio=radio.get(i);
		String value=local_radio.getAttribute("value");
		System.out.println(value);
			
		if(value.equalsIgnoreCase("RUBY")) {
			
		local_radio.click();	
		}
		}
	
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
		
		for(int i=0; i<checkbox.size();i++) {
		WebElement local_checkbox=checkbox.get(i);
		String value1=local_checkbox.getAttribute("id");
		
		System.out.println(value1);
		if(value1.equalsIgnoreCase("sing")) {
			
			local_checkbox.click();
			break;
			
		}
			
			
			
			
		}
		
		
		
	}

}
