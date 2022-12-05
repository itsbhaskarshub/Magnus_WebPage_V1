package com.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPage_Login {
	
	public WebDriver Webpage_local_driver;
	
	public WebPage_Login(WebDriver root_driver)
	{
		Webpage_local_driver = root_driver;
		PageFactory.initElements(root_driver, this);
	}
	
	// Email Text Box
	@FindBy(xpath = "//input[@id = 'UserName']")
	@CacheLookup
	WebElement Email;
	
	public void Emailid(String email_id) {
		Email.sendKeys(email_id);
	}
	
	// password Text Box
	@FindBy(xpath = "//input[@id = 'Password']")
	@CacheLookup
	WebElement password;
	
	public void password(String pwd) {
		password.sendKeys(pwd);
	}
	
	// RememberMe Box
	@FindBy(xpath = "//*[contains(@class,'container1')]")
	@CacheLookup
	WebElement RememberMe;
	
	public void RememberMe() {
		RememberMe.click();
	}
	
	// Login Button
	@FindBy(id = "btnLogin")
	@CacheLookup
	WebElement Login;
	
	public void Login() {
		Login.click();
	}
	
	// Logout button
	
	@FindBy(xpath = "//*[contains(@href, 'SignOut')]")
	@CacheLookup
	WebElement LogOut;
	
	public void Logout() {
		LogOut.click();
	}
	

}
