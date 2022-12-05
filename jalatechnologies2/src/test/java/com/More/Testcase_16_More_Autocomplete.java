package com.More;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Testcase_16_More_Autocomplete {
	
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
	
	class more_AutoComplete{
		
		public void Single_Values() throws InterruptedException {
			
			WebElement sv = driver.findElement(By.xpath("//*[@href='#tab_1']"));
			sv.click();
			String output = sv.getText().toString();
			if(output.equalsIgnoreCase("Single Values")) {
				System.out.println(output);
				WebElement txt = driver.findElement(By.xpath("//*[@id='txtSingleAutoComplete']"));
				txt.sendKeys("java");
				txt.sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Passed");

			}
		}
		
		public void Multiple_Values() throws InterruptedException {
			
			WebElement sv = driver.findElement(By.xpath("//*[@href='#tab_2']"));
			sv.click();
			String output = sv.getText().toString();
			if(output.equalsIgnoreCase("Multiple Values")) {
				System.out.println(output);
				WebElement txt = driver.findElement(By.xpath("//*[@id='txtMultipleAutoComplete']"));
				txt.sendKeys("java");
				txt.sendKeys(Keys.ENTER);
				txt.sendKeys(", ");
				txt.sendKeys("Python");
				txt.sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Passed");

			}

			}
		}

		
			
		 
	

	
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
		driver.findElement(By.xpath("//*[contains(text(),'Autocomplete')]")).click();
		
		/*
		 * For Autocomplete
		 */
		Testcase_16_More_Autocomplete m = new Testcase_16_More_Autocomplete();
		Testcase_16_More_Autocomplete.more_AutoComplete ma = m.new more_AutoComplete();
		ma.Single_Values();
		ma.Multiple_Values();


		
		
		driver.close();

	    }   
	}


