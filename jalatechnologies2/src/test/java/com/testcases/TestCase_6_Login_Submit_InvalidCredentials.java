package com.testcases;

/*
 * @Bharatha_Bhaskar
 * @github: https://github.com/itsbhaskarshub
 * @bharathabhaskar1009@gmail.com
 * 
 * test case 003 Click on Sign In button without Credientials 
 * 
 */
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.webpages.WebPage_Login;

public class TestCase_6_Login_Submit_InvalidCredentials{
	

	public static WebPage_Login Webpage_localdriver_page;
	public static String url = "https://magnus.jalatechnologies.com/";
	public static String path = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
	public static String expected_title =  "JALA Academy";
	public static String emailid = "training@jalacademy.com";
	public static String pwd = "jobprogram";

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver = new EdgeDriver();
		Webpage_localdriver_page = new WebPage_Login(driver);
		Thread.sleep(2000);
		driver.get(url);
		
		
		Webpage_localdriver_page.Emailid(emailid);
		Webpage_localdriver_page.password(pwd);
		
		Webpage_localdriver_page.Login();
		Thread.sleep(2000);
		WebElement txt_alert = driver.findElement(By.xpath("//*[contains(text(),'Error!')]"));
		String error = txt_alert.getText();
		
		if (error.equalsIgnoreCase("Error!"))
			{
					txt_alert.click();
			} 
		 
		System.out.println(error);
					driver.close();
				}
		

	}
		


