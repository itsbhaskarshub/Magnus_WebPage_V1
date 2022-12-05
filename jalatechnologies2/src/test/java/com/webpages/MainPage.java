package com.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MainPage extends WebPage_Login{
	
	public WebDriver local_driver;

	public MainPage(WebDriver root_driver) {
		super(root_driver);
		// TODO Auto-generated constructor stub
	}

	

	
	// Sider_toggle for Tabs
	@FindBy(xpath = "//*[contains(@role,'button')]")
	@CacheLookup
	WebElement Sider_toggle;
	
	public void  Sider_toggle   () {
		Sider_toggle.click();
				
	}
	
	// Sider_toggle list
	// Sider_toggle. index 0 for employee
	// Sider_toggle. index 1 for more
	// Sider_toggle. index 2 for Setting
	

	
	// WebElement for create button
	@FindBy(xpath = "//*[contains(@href,'Create')]")
	@CacheLookup
	WebElement Create;
	
	public void  Create() {
		Create.click();
	}

	
	
	// WebElement for Save button
	@FindBy(xpath = "//button[@type = 'button']")
	@CacheLookup
	WebElement save;
	
	public void  save_button() {
		save.click();
	}
	
	// WebElement for Search button
	@FindBy(xpath = "//*[contains(@href,'Search')]")
	@CacheLookup
	WebElement Search;
	
	public void  Search() {
		Search.click();
	}
	
	
		
	// Logout button
	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	@CacheLookup
	WebElement LogOut;
	
	public void  LogOut() {
		LogOut.click();
				
	}
	
	

}
