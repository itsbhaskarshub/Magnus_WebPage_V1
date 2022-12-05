package com.More;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Testcase_18_More_Import_IO {
	
	public static String url = "https://magnus.jalatechnologies.com/";
	public static String path = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
	public static String expected_title =  "JALA Academy";
	public static String emailid = "training@jalaacademy.com";
	public static String pwd = "jobprogram";
	public static WebDriver driver;
	
	
	/*
	 * Multiple Tabs
	 * Menu
	 * Autocomplete
	 * Collapsible Content
	 * Images
	 * Slider
	 * Tooltips
	 * Popups
	 * Links
	 * CSS Properties
	 * iFrames
	 */
	
	
		
	

		
			
		 
	

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver", path);
		driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys(emailid);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Images')]")).click();
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		WebElement Locator = driver.findElement(By.xpath("//*[contains(text(),'Select File : ')]"));
		
		action.moveToElement(Locator).doubleClick().build().perform();
		
		

		System.out.println("xx");
		

		
		

	    }   
	}


