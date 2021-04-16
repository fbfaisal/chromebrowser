package com.tesng.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLabs {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void login() { 
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).isDisplayed());
		System.out.println("<======Verified Page====>");	
	}
	
	@AfterTest
	public void quit() {
		
	driver.quit();
		
		
	}
	
}
