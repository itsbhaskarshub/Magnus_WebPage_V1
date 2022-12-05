package com.testcases;

/*
 * @Bharatha_Bhaskar
 * @github: https://github.com/itsbhaskarshub
 * @bharathabhaskar1009@gmail.com
 * 
 * test case 002 extracting emailid and password 
 * 
 */
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase_2_Extract_Credentials {
	
	public static String url = "https://magnus.jalatechnologies.com/";
	public static String path = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
	public static String expected_title =  "JALA Academy";

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.get(url);
		
		
		String webpage_email = driver.findElement(By.xpath("//h5[contains(text(),'Email : training@jalaacademy.com')]")).getText();
		
		String[] email = webpage_email.split(":");
		String Emailid = email[1].trim();
		
		String webpage_pwd = driver.findElement(By.xpath("//h5[contains(text(),'Password : jobprogram')]")).getText();
		String[] pwd = webpage_pwd.split(":");
		String password = pwd[1].trim();

		System.out.println(Emailid);
		System.out.println(password);
		
		driver.close();

	}
	
	
	
	
	

}
