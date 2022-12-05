package com.testscenarios;

/*
 * @Bharatha_Bhaskar
 * @github: https://github.com/itsbhaskarshub
 * @bharathabhaskar1009@gmail.com
 * 
 * test case 005 Click on Sign In button without Credientials 
 * 		
		 * Enter Employee Details
		 * First name = Bhaskar
		 * Last Name = Bharatha
		 * Email = bharathabhaskarnetha@gmail.com
		 * Mobile Number = 8801744320
		 * Date of Birth = 10/09/1991
		 * Gender = Male
		 * Address = 13-11-11/Kukatpally
		 * Country = India
		 * City = Hyderabad
		 * Skills = QA - Automation
 */

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.webpages.Create_Employee;
import com.webpages.MainPage;
import com.webpages.WebPage_Login;

public class TestCase_01_Create_Employee_IOMethod{
	

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
		Scanner input = new Scanner (System.in);
		System.setProperty("webdriver.edge.driver", path);
		System.out.println(" Test Bed and Test Environment is Configured");
		driver = new EdgeDriver();
		Webpage_localdriver_page = new WebPage_Login(driver);
		Thread.sleep(2000);
		System.out.println("MicroSoft Edge Invoke");

		driver.get(url);
		System.out.println("Magnus WebPage is Open");

		
		
		
		Webpage_localdriver_page.Emailid(emailid);
		Webpage_localdriver_page.password(pwd);
		Webpage_localdriver_page.Login();
		
		System.out.println("Login Email id has been Initial");
		System.out.println(" Login password has been Initial");
		System.out.println(" Main Web Page of Magnus as invoked");

		Thread.sleep(5000);	
		
		
		magnus_MainPage = new MainPage(driver);
		
		/*
		 *  For Employee -- select list the webelement in Silder on The left 
		 *  and select index 1 then click
		 */
		List<WebElement> list_Slider = driver.findElements(By.xpath("//*[contains(@href,'#')]/i[1]"));
		list_Slider.get(0).click();
		
		System.out.println("Selected Employee");

		magnus_MainPage.Create();
		System.out.println("Selected Create");

		

		
	
		new_Employee = new Create_Employee(driver);
		System.out.println("Please Enter The first name of Employee");
		String First_Name = input.nextLine();
		new_Employee.FirstName(First_Name);
		
		
		System.out.println("Please Enter The last name of Employee");
		String Last_Name = input.nextLine();
		new_Employee.LastName(Last_Name);
		
		
		System.out.println("Please Enter The Email Id of Employee");
		String Email = input.nextLine();
		new_Employee.EmailId(Email);
		
		System.out.println("Please Enter The Phone Number of Employee");
		String Phone_Number = input.nextLine();
		new_Employee.MobileNo(Phone_Number);
		
		
		System.out.println("Please Enter The Date of Birth of Employee");
		String D_O_B = input.nextLine();
		WebElement Date_of_Birth = driver.findElement(By.id("DOB"));
		Date_of_Birth.click();
		Date_of_Birth.sendKeys(D_O_B);
		
		
		System.out.println("Please Enter Gender of Employee");		
		List<WebElement> gender = driver.findElements(By.xpath("//input[@type ='radio']"));
		String Employee_Gender = input.nextLine();
		
		if (Employee_Gender.equalsIgnoreCase("male")) {
			gender.get(0).click();
			
		}
		else {
			gender.get(1).click();
		}
		
		
		System.out.println("Please Enter The Address of Employee");
		String Adress = input.nextLine();
		new_Employee.Address(Adress);
		

		WebElement country = driver.findElement(By.id("CountryId"));
		country.click();
		Select dropdown1 = new Select (country);
		System.out.println("Please Enter The Country of Employee");
		String myCountry_name = input.nextLine();
		dropdown1.selectByVisibleText(myCountry_name);
		
		WebElement city = driver.findElement(By.id("CityId"));
		country.click();
		Select dropdown2 = new Select (city);
		System.out.println("Please Enter The City of Employee");
		String myCity_name = input.nextLine();
		dropdown2.selectByVisibleText(myCity_name);	
		
		List<WebElement> Skills = driver.findElements(By.xpath("//*[@class='chkSkill m-r-sm']"));
		System.out.println("Please Enter Type of Skills of Employee");
		String selected_Skill =  input.nextLine();
		/*
		 * AWS -- index 0
		 * DevOps -- index 1
		 * Full Stack Developer -- index 2
		 * Middleware -- index 3
		 * QA-Automation -- index 4
		 * WebServices -- index 5
		 */

		 
		if (selected_Skill.equalsIgnoreCase("AWS")) {
			Skills.get(0).click();
		}
		else if (selected_Skill.equalsIgnoreCase("DevOps")) {
			Skills.get(1).click();
		}
		else if (selected_Skill.equalsIgnoreCase("Full Stack Developer")) {
			Skills.get(2).click();
		}
		else if (selected_Skill.equalsIgnoreCase("Middleware")) {
			Skills.get(3).click();
		}
		else if (selected_Skill.equalsIgnoreCase("QA-Automation")) {
			Skills.get(4).click();
		}
		else if (selected_Skill.equalsIgnoreCase("WebServices")) {
			Skills.get(5).click();
			
		}
		else {
			System.out.println("Error");
		
		}
		
		magnus_MainPage.save_button();
		input.close();
		driver.close();
	
				
	
	}
}
		


