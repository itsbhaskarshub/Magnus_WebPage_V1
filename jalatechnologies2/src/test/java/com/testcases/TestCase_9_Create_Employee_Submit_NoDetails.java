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
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.webpages.MainPage;
import com.webpages.WebPage_Login;

public class TestCase_9_Create_Employee_Submit_NoDetails{
	

	public static WebPage_Login Webpage_localdriver_page;
	public static MainPage magnus_MainPage;

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
		
		
		magnus_MainPage = new MainPage(driver);
		
		/*
		 *  For Employee -- select list the webelement in Silder on The left 
		 *  and select index 1 then click
		 */
		List<WebElement> list_Slider = driver.findElements(By.xpath("//*[contains(@href,'#')]/i[1]"));
		list_Slider.get(0).click();
		
		
		magnus_MainPage.Create();
		magnus_MainPage.save_button();
		
		Thread.sleep(2000);
		WebElement txt_alert = driver.findElement(By.xpath("//*[contains(text(),'Error!')]"));
		String error = txt_alert.getText();
		
		if (error.equalsIgnoreCase("Error!"))
			{
					txt_alert.click();
					System.out.println("Please Enter the Details of Employee");
			} 
		 
		System.out.println(error);
					driver.close();
				}
		 
	}
		


