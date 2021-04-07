/**
 * 
 */
package com.orangehrmlive.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By username=By.id("txtUsername");
	By password=By.xpath("//input[@name='txtPassword']");
	By login=By.id("btnLogin");	
	
	
	
	public LoginPage(WebDriver driver) {
	
	this.driver=driver;
	
	}
	
	//public void username(String uid) {
		
		//driver.findElement(username).sendKeys(uid);
	
	//}
	
	//public void pass(String pass) {
		
	//	driver.findElement(password).sendKeys(pass);
	//}
	
	
	//public void loginbutton() {
		
	//	driver.findElement(login).click();
	//}
	
	
	
	public void logintoorange(String uname,String pass) {
		
		
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		
	}
	
	
}
