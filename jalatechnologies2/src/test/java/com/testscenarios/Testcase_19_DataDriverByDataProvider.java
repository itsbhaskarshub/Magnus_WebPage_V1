package com.testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Testcase_19_DataDriverByDataProvider{
	
	public static String expected_title =  "JALA Academy";
	public static WebDriver driver;
	


	@SuppressWarnings("deprecation")
	@Test(dataProvider = "LoginCredientials")
	public void LoginTest(String browser, String url, String emailid, String password ) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", browser);
		driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys(emailid);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);	
		
		
		driver.close();
	}
	

	@DataProvider
	public Object[][] LoginCredientials() {
		
		Object[][] Credientials = new Object[2][4];
		Credientials[0][0] = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
		Credientials[0][1] = "https://magnus.jalatechnologies.com/";
		Credientials[0][2] = "training@jalaacademy.com";
		Credientials[0][3] = "jobprogram";
		
		Credientials[1][0] = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
		Credientials[1][1] = "https://magnus.jalatechnologies.com/";
		Credientials[1][2] = "training@jalaacademy.com";
		Credientials[1][3] = "jobprogram";
		return Credientials;

	}
	 
		
	}



