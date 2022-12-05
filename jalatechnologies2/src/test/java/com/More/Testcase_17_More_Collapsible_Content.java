package com.More;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Testcase_17_More_Collapsible_Content {
	
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
	
	class more_Collapsible_Content{
		
		class Single_Collapse{
			
			public void single_collapse() {
				WebElement collapse =  driver.findElement(By.xpath("//*[contains(text(),'Single Collapse')]"));
				collapse.click();
			}
			
			public void collapseOne() {
				WebElement collapse = driver.findElement(By.xpath("//*[@role='button'][@aria-controls ='collapseOne']"));
				String txt = collapse.getText().toString();
				System.out.println(txt);
				collapse.click();
				System.out.println("Test Pass");
			}
			
			public void collapseTwo() {
				WebElement collapse = driver.findElement(By.xpath("//*[@role='button'][@aria-controls ='collapseTwo']"));
				String txt = collapse.getText().toString();
				System.out.println(txt);
				collapse.click();
				System.out.println("Test Pass");
			}
			
			public void collapseThree() {
				WebElement collapse = driver.findElement(By.xpath("//*[@role='button'][@aria-controls ='collapseThree']"));
				String txt = collapse.getText().toString();
				System.out.println(txt);
				collapse.click();
				System.out.println("Test Pass");
			}
			
		}
		
		class Multiple_Collapse{
			public void Multiple_collapse() {
				WebElement collapse =  driver.findElement(By.xpath("//*[contains(text(),'Multiple Collapse')]"));
				collapse.click();
			}
			
			public void collapseFour() {
				WebElement collapse = driver.findElement(By.xpath("//*[@role='button'][@aria-controls ='collapseFour']"));
				String txt = collapse.getText().toString();
				System.out.println(txt);
				collapse.click();
				System.out.println("Test Pass");
			}
			
			public void collapseFive() {
				WebElement collapse = driver.findElement(By.xpath("//*[@role='button'][@aria-controls ='collapseFive']"));
				String txt = collapse.getText().toString();
				System.out.println(txt);
				collapse.click();
				System.out.println("Test Pass");
			}
			
			public void collapseSix() {
				WebElement collapse = driver.findElement(By.xpath("//*[@role='button'][@aria-controls ='collapseSix']"));
				String txt = collapse.getText().toString();
				System.out.println(txt);
				collapse.click();
				System.out.println("Test Pass");
			}
			
			public void collapseSeven() {
				WebElement collapse = driver.findElement(By.xpath("//*[@role='button'][@aria-controls ='collapseSeven']"));
				String txt = collapse.getText().toString();
				System.out.println(txt);
				collapse.click();
				System.out.println("Test Pass");
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
		driver.findElement(By.xpath("//*[contains(text(),' Collapsible Content')]")).click();
		
		/*
		 * For Collapse content
		 */
		Testcase_17_More_Collapsible_Content m = new Testcase_17_More_Collapsible_Content();
		Testcase_17_More_Collapsible_Content.more_Collapsible_Content mcc = m.new more_Collapsible_Content();
		
		/*
		 * for Single collapse
		 */
		Testcase_17_More_Collapsible_Content.more_Collapsible_Content.Single_Collapse sc = mcc.new Single_Collapse();
		sc.single_collapse();
		sc.collapseOne();
		sc.collapseTwo();
		sc.collapseThree();
		
		/*
		 * for Multiple collapse
		 */
		Testcase_17_More_Collapsible_Content.more_Collapsible_Content.Multiple_Collapse mc = mcc.new Multiple_Collapse();
		mc.Multiple_collapse();
		mc.collapseFour();
		mc.collapseFive();
		mc.collapseSix();
		mc.collapseSeven();
		
		
		driver.close();

		
		

	    }   
	}


