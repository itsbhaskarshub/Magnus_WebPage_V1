package com.testscenarios;

import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class TestCase_20_DataDrivenByCSVFile {
	
	public static String browser = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
	public static String URL = "https://magnus.jalatechnologies.com/";
	public static String Emailid = "training@jalaacademy.com";
	public static String Password  = "jobprogram";
	public static WebDriver driver;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static int row;
	public static int column;

	public static XSSFCell cell;
	
	
	
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", browser);
		driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys(Emailid);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);	
		List<WebElement> list_Slider = driver.findElements(By.xpath("//*[contains(@href,'#')]/i[1]"));
		list_Slider.get(0).click();
	}
	
	@Test(dataProvider ="Employee_Details")
	public void Create_Employee(
			String fname,
			String lname,
			String email,
			String PhoneNo,
			String dob,
			String gender,
			String Address,
			String country,
			String city,
			String skill  
								) throws InterruptedException 
									{

		driver.findElement(By.xpath("//*[contains(@href,'Create')]")).click();

		driver.findElement(By.id("FirstName")).sendKeys(fname);
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys(lname); 
		Thread.sleep(2000);
		driver.findElement(By.id("EmailId")).sendKeys(email); 
		Thread.sleep(2000);
		driver.findElement(By.id("MobileNo")).sendKeys(PhoneNo);
		Thread.sleep(2000);
		driver.findElement(By.id("DOB")).sendKeys(dob);
		Thread.sleep(2000);

		
		List<WebElement> gender1 = driver.findElements(By.xpath("//input[@type ='radio']"));
		String Employee_Gender = gender;
		
		Thread.sleep(2000);
		if (Employee_Gender.equalsIgnoreCase("male")) {
			gender1.get(0).click();
			
		}
		else {
			gender1.get(1).click();
		}

		Thread.sleep(2000);

		driver.findElement(By.id("Address")).sendKeys(Address);
		Thread.sleep(2000);
		
		WebElement country1 = driver.findElement(By.id("CountryId"));
		country1.click();
		Select dropdown1 = new Select (country1);
		String myCountry_name = country;
		dropdown1.selectByVisibleText(myCountry_name);
		
		Thread.sleep(2000);
		WebElement city1 = driver.findElement(By.id("CityId"));
		country1.click();
		Select dropdown2 = new Select (city1);
		String myCity_name = city;
		dropdown2.selectByVisibleText(myCity_name);	
		
		Thread.sleep(2000);
		List<WebElement> Skills = driver.findElements(By.xpath("//*[@class='chkSkill m-r-sm']"));
	
		String selected_Skill = skill; 
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
		
		driver.findElement(By.xpath("//*[contains(text(),'Save')]")).click();
		
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
	
	
	@DataProvider(name ="Employee_Details")
	public Object[][] Employee_Details() throws IOException {
		

		ExcelDataConfig Details = new ExcelDataConfig("..//jalatechnologies/CSVFileLocation/NewEmployeeCreation.xlsx");
        int rows = Details.getRowCount(0);
        int cells = Details.getCellCount(0, 1);

		Object[][] csv = new Object[rows][cells];

		
		 for(int i = 1; i< rows; i++) {
			 for(int j = 0; j< cells; j++) {
	        	csv[i][j] = Details.getData(0, i, j);
		}
	}
		return csv; 

}
} 
