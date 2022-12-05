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

public class TestCase_4_Login_Submit_EnterOnlyEmailID{
	

	public static WebPage_Login Webpage_localdriver_page;
	public static String url = "https://magnus.jalatechnologies.com/";
	public static String path = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
	public static String expected_title =  "JALA Academy";
	public static String emailid = "training@jalaacademy.com";
	public static String pwd = "jobprogram";

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver = new EdgeDriver();
		Webpage_localdriver_page = new WebPage_Login(driver);
		Thread.sleep(2000);
		driver.get(url);
		Webpage_localdriver_page.Emailid(emailid);
		
		Webpage_localdriver_page.Login();
		
		WebElement txt_alert = driver.findElement(By.xpath("//*[contains(text(),'Error!')]"));
		String error = txt_alert.toString();
		
			try 
			{
				if (error.equalsIgnoreCase("Error!"))
				{
					txt_alert.click();
				} 
			} 
			finally 
			{
				WebElement Error_Text = driver.findElement(By.xpath("//span[contains(text(),'Please')]"));
				String invaild = Error_Text.getText();
				if(invaild.contains("email")) {
					System.out.println(invaild);
					driver.close();

				}
				else if (invaild.contains("password")) {
					System.out.println(invaild);
					driver.close();
				}

				else {
					System.out.println("Error");
					driver.close();
				}
			}

	}
		

}
