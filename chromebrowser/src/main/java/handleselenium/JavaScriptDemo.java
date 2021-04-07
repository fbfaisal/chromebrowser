package handleselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) throws Exception {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&.done=https%3A%2F%2Fwww.yahoo.com%2F&pspid=2023538075&activity=ybar-signin");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement email=driver.findElement(By.name("username"));
		js.executeScript("arguments[0].value='fbfaisal.qa'", email);
		
		WebElement checkbox=driver.findElement(By.name("signin"));
		js.executeScript("arguments[0].click()", checkbox);
		
		WebElement tickbox=driver.findElement(By.xpath("//input[@type='checkbox' and @name='persistent']"));
		
		//js.executeScript("document.getElementById('persistent').click()");
		js.executeScript("arguments[0].click()", tickbox);
		
		
		
	}

}
