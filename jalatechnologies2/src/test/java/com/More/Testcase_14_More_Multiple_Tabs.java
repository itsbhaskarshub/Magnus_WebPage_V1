package com.More;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Testcase_14_More_Multiple_Tabs {
	
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
	
	class Multiple_Tabs{
		
		public void tab_1(){
			
			WebElement Tab_1 = driver.findElement(By.xpath("//*[contains(text(),'Plan to Succeed')]"));
		    String tab1 = Tab_1.getText().toString();
		    
		    if(tab1.contains("Plan to Succeed")) {
		    	Tab_1.click();
		    	WebElement output_text = driver.findElement(By.xpath("//*[contains(text(),'Congratulations')]"));
		    	String x = output_text.getText().toString();
		    	String[] t = x.split(",");
		    	if(t[0].equalsIgnoreCase("Congratulations")) {
		    		System.out.println("Test Pass");
		    	}
		    	else {
		    		System.out.println("Test Fail");
		    	}
		    }
	}
		
		public void tab_2(){
			
			WebElement Tab_2 = driver.findElement(By.xpath("//*[contains(text(),'UnLearning')]"));
		    String tab1 = Tab_2.getText().toString();
		    
		    if(tab1.contains("UnLearning")) {
		    	Tab_2.click();
		    	WebElement output_text = driver.findElement(By.xpath("//*[contains(text(),'Unfortunately')]"));
		    	String x = output_text.getText().toString();
		    	String[] t = x.split(",");
		    	if(t[0].equalsIgnoreCase("Unfortunately")) {
		    		System.out.println("Test Pass");
		    	}
		    	else {
		    		System.out.println("Test Fail");
		    	}
		}
	}
		public void tab_3(){
			
			WebElement Tab_3 = driver.findElement(By.xpath("//*[contains(text(),'Ways of Unlearning')]"));
		    String tab1 = Tab_3.getText().toString();

		    if(tab1.equalsIgnoreCase("Ways of Unlearning")) {
		    	Tab_3.click();
		    	WebElement output_text = driver.findElement(By.xpath("//*[contains(text(),'unlearned')]"));
		    	String x = output_text.getText().toString();
		    	String[] t = x.split("first");
		    	
		    	if(t[0].contains("The")) {
		    		System.out.println("Test Pass");
		    	}
		    	else {
		    		System.out.println("Test Fail");
		    	}
		    	
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
		driver.findElement(By.xpath("//*[contains(text(),' Multiple Tabs')]")).click();
		
		Testcase_14_More_Multiple_Tabs m = new Testcase_14_More_Multiple_Tabs();
		Testcase_14_More_Multiple_Tabs.Multiple_Tabs mt = m.new  Multiple_Tabs();
		mt.tab_1();
		mt.tab_2();
		mt.tab_3();
	    driver.close();


		
	    	
	    }   
	}


