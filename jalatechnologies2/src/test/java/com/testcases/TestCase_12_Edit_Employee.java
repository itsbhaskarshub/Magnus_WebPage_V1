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

import com.webpages.Create_Employee;
import com.webpages.MainPage;
import com.webpages.Search_Employee;
import com.webpages.WebPage_Login;

public class TestCase_12_Edit_Employee{
	

	public static WebPage_Login Webpage_localdriver_page;
	public static MainPage magnus_MainPage;
	public static Create_Employee new_Employee;
	public static Search_Employee Edit_Employee;

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
		driver.manage().window().maximize();
		driver.get(url);
		
		Webpage_localdriver_page.Emailid(emailid);
		Webpage_localdriver_page.password(pwd);
		Webpage_localdriver_page.Login();
		Thread.sleep(5000);	
		String Webpage_Current = driver.getTitle();
		
		if(Webpage_Current.equalsIgnoreCase("Magnus") ) {
			Thread.sleep(5000);
			List<WebElement> list_Slider = driver.findElements(By.xpath("//*[contains(@href,'#')]/i[1]"));
			list_Slider.get(0).click();
			
			magnus_MainPage = new MainPage(driver);
			Thread.sleep(2000);

			magnus_MainPage.Search();
			
			Edit_Employee = new Search_Employee(driver);
			Thread.sleep(2000);
			
			String Search_Name = "Bhaskar";
			Edit_Employee.SearchEmployee(Search_Name);
			Edit_Employee.search_Button();
			Thread.sleep(2000);

			WebElement  list= driver.findElement(By.xpath("//tr/td[1]"));
				if(list.getText().equalsIgnoreCase(Search_Name)) {
					WebElement edit_button = driver.findElement(By.xpath("//*[@title = 'Edit']"));
					edit_button.click();
					String title = driver.getTitle();
					if(title.equalsIgnoreCase("Edit Employee")) {
						System.out.println(title);
						WebElement address = driver.findElement(By.id("Address"));
						address.clear();
						address.sendKeys("Moosapet, Kukatpally");
						Thread.sleep(5000);
						
						WebElement update = driver.findElement(By.xpath("//*[contains(@type ,'button')]"));
						update.click();
						
						String title_current = driver.getTitle();

						if(title_current.equalsIgnoreCase("Edit Employee")) {
							System.out.println("Test Pass");
							driver.close();
				
						}
						else {
							System.out.println("Test fail");
						}
					}
					else {
						System.out.println("Test fail");
					}
				}
				else {
					System.out.println("Test fail");
				}
				
			}
		driver.close();


		}
		
		
	}

		


