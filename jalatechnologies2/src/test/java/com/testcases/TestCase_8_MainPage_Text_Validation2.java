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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.webpages.WebPage_Login;

public class TestCase_8_MainPage_Text_Validation2{
	

	public static WebPage_Login Webpage_localdriver_page;
	public static String url = "https://magnus.jalatechnologies.com/";
	public static String path = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
	public static String expected_title =  "JALA Academy";
	public static String emailid = "training@jalaacademy.com";
	public static String pwd = "jobprogram";
	public static String title = "Welcome to JALA Academy";

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver = new EdgeDriver();
		Webpage_localdriver_page = new WebPage_Login(driver);
		Thread.sleep(2000);
		driver.get(url);
		
		Webpage_localdriver_page.Emailid(emailid);
		Webpage_localdriver_page.password(pwd);

		Webpage_localdriver_page.Login();
			
		/*
		 * After Sign In 
		 */
		Thread.sleep(5000);	
		WebElement Main_WebPage_Title = driver.findElement(By.xpath("//*[contains(text(),'working')]"));
		
		String text_form_Page = Main_WebPage_Title.getText();
		 String[] only_Text = text_form_Page.split("60");

		 if (only_Text[0].equalsIgnoreCase("gap")) {
			 System.out.println("The Test Pass");
		 }
		 else
		 {
			 System.out.println("The Test Fail");
		 }
		 driver.close();
		 
	}
		

}
