package chromebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromebrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	}

}
