package com.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Create_Employee extends MainPage {
	
	public Create_Employee(WebDriver root_driver) {
		super(root_driver);
		// TODO Auto-generated constructor stub
	}

	public WebDriver local_driver;
	

	
	// First Name
	@FindBy(id = "FirstName") WebElement First;
	public void FirstName(String Fname) {
		First.sendKeys(Fname);
	}
	
	// Last Name
	@FindBy(id = "LastName") WebElement Last;
	public void LastName(String Lname) {
		Last.sendKeys(Lname);
	}
	// EmailId Name
	@FindBy(id = "EmailId") WebElement EmailId;
	public void EmailId(String email) {
		EmailId.sendKeys(email);
	}
	// MobileNo Name
	@FindBy(id = "MobileNo") WebElement MobileNo;
	public void MobileNo(String number) {
		MobileNo.sendKeys(number);
	}
	// DOB Name
	@FindBy(id = "DOB") WebElement dob;
	public void DOB(String Fname) {
		dob.click();
	}

	// Address Name
	@FindBy(id = "Address") WebElement address;
	public void Address(String add) {
		address.sendKeys(add);
	}	

}
