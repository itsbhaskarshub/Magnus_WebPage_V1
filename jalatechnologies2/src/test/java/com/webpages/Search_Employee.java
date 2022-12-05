package com.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Employee extends WebPage_Login {
	
	public Search_Employee(WebDriver root_driver) {
		super(root_driver);
		// TODO Auto-generated constructor stub
	}

	public WebDriver local_driver;
	

	

	
	/*
	 * search Employee by Name
	 */
	
	@FindBy(id = "Name") WebElement SearchByName;
	public void SearchEmployee(String Employee_Name) {
		SearchByName.sendKeys(Employee_Name);
	}
		
	/*
	 * Search Button 
	 */
	
	@FindBy(id = "btnSearch") WebElement search_Button;
	public void search_Button() {
		search_Button.click();
	}
	
}
