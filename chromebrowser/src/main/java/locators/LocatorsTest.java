package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Ftag%3Damazusnavi-20%26hvadid%3D381823327651%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D11327869366746329931%26hvpone%3D%26hvptwo%3D%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1023038%26hvtargid%3Dkwd-10573980%26ref%3Dnav_ya_signin%26hydadcr%3D28883_11845442%26gclid%3DCjwKCAjwgOGCBhAlEiwA7FUXkgs4g5fZIzgfEkVaRgDomp3ihgn_dJNLXpuVeOG9XWpWH0c0ZrvRxxoCgxQQAvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		//driver.findElement(By.id("txtUsername")).sendKeys("admin");
		//driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
		//driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id*='ap_email']")).sendKeys("ffff");
		driver.findElement(By.cssSelector("input[id*='continue']")).click();
		
	}

}
