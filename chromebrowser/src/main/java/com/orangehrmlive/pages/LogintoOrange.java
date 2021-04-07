package com.orangehrmlive.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogintoOrange {
	
	WebDriver driver;
	
	public LogintoOrange(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void login(String uid, String upass) {

		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(upass);
		driver.findElement(By.id("btnLogin")).click();;
		
		
	}
	
}
