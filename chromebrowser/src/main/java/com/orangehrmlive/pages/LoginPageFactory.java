package com.orangehrmlive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {
	
	WebDriver driver;
	
	public LoginPageFactory(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	@FindBy(id="txtUsername") WebElement user_name;
	
	@FindBy(how=How.ID,using="txtPassword") WebElement user_password;
	
	@FindBy(how=How.XPATH, using="//input[@name='Submit']") WebElement login_button;



public void login_orange(String uid, String pass) {
	
	user_name.sendKeys(uid);
	user_password.sendKeys(pass);
	login_button.click();
	
}
}
