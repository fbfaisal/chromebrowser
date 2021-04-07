package handleselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown {
	
	@Test
	public void ScrollDownDemo() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement element=driver.findElement(By.cssSelector("div.showcase:nth-child(3) section:nth-child(1) div.content.mCustomScrollbar._mCS_3:nth-child(3) div.mCustomScrollBox.mCS-light-thick.mCSB_vertical.mCSB_outside div.mCSB_container > p:nth-child(5)"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
		
		System.out.println(element.getText());
		
	}
	

}
