package com.testcases;

/*
 * @Bharatha_Bhaskar
 * @github: https://github.com/itsbhaskarshub
 * @bharathabhaskar1009@gmail.com
 * 
 * test case 005 Click on Sign In button without Credientials 
 * 
 */
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.webpages.Create_Employee;
import com.webpages.MainPage;
import com.webpages.WebPage_Login;

public class TestCase_11_LogOut{
	

	public static WebPage_Login Webpage_localdriver_page;
	public static MainPage magnus_MainPage;
	public static Create_Employee new_Employee;

	public static String url = "https://magnus.jalatechnologies.com/";
	public static String path = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
	public static String expected_title =  "JALA Academy";
	public static String emailid = "training@jalaacademy.com";
	public static String pwd = "jobprogram";
	public static String title = "Welcome to JALA Academy";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver", path);
		driver = new EdgeDriver();
		Webpage_localdriver_page = new WebPage_Login(driver);
		Thread.sleep(2000);
		driver.get(url);
		
		Webpage_localdriver_page.Emailid(emailid);
		Webpage_localdriver_page.password(pwd);
		Webpage_localdriver_page.Login();
		Thread.sleep(5000);	
		String Webpage_Current = driver.getTitle();
		
		if(Webpage_Current.equalsIgnoreCase("Magnus") ) {
			Thread.sleep(5000);
			Webpage_localdriver_page.Logout();
			String Webpage = driver.getTitle();
			if(Webpage.equalsIgnoreCase("Login")) {
				System.out.println("Test Pass");
			}
			else {
				System.out.println("Test fail");
			}

		}
		else {
			System.out.println("Still on Main Page");
			System.out.println("Test fail");
		}
		
		driver.close();
		
		
	}
}
		


