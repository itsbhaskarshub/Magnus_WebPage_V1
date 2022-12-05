package com.More;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Testcase_15_More_Menu {
	
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
	
	class more_Menu{
		
			class Single_Menus{
				
				/*
				 * Single Menu Tab
				 * Testing
				 * Java
				 * .Net
				 * Data Base
				 */
				
				public void Single_Menus_Tab() {
					WebElement Tab_1 = driver.findElement(By.xpath("//*[contains(text(),'Single Menus')]"));
				    String tab1 = Tab_1.getText().toString();
				    if(tab1.contains("Single Menus")) {
				    	Tab_1.click();
				    }
				}				
				public void Testing() {
					WebElement Selected_Skill = driver.findElement(By.xpath("//*[contains(text(),'Testing')]"));
			    	String x = Selected_Skill.getText().toString();
			    	if(x.equalsIgnoreCase("Testing")) {
			    		Selected_Skill.click();
			    		System.out.println("Test Pass");
			    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Testing')]"));
			    		String print_txt = txt_output.getText().toString();
			    		System.out.println(print_txt);
			    	}
			    	else {
			    		System.out.println("Test Fail");
			    	}
			} 			
				public void Java() {
					WebElement Selected_Skill = driver.findElement(By.xpath("//*[contains(text(),'Java')]"));
			    	String x = Selected_Skill.getText().toString();
			    	if(x.equalsIgnoreCase("Java")) {
			    		Selected_Skill.click();
			    		System.out.println("Test Pass");
			    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Java')]"));
			    		String print_txt = txt_output.getText().toString();
			    		System.out.println(print_txt);
			    	}
			    	else {
			    		System.out.println("Test Fail");
			    	}
			} 			
				public void net() {
					WebElement Selected_Skill = driver.findElement(By.xpath("//*[contains(text(),'.Net')]"));
			    	String x = Selected_Skill.getText().toString();
			    	if(x.equalsIgnoreCase(".Net")) {
			    		Selected_Skill.click();
			    		System.out.println("Test Pass");
			    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected .Net')]"));
			    		String print_txt = txt_output.getText().toString();
			    		System.out.println(print_txt);
			    	}
			    	else {
			    		System.out.println("Test Fail");
			    	}
			} 
				public void Data_Base() {
					WebElement Selected_Skill = driver.findElement(By.xpath("//*[contains(text(),'Data Base')]"));
			    	String x = Selected_Skill.getText().toString();
			    	if(x.equalsIgnoreCase("Data Base")) {
			    		Selected_Skill.click();
			    		System.out.println("Test Pass");
			    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Data base')]"));
			    		String print_txt = txt_output.getText().toString();
			    		System.out.println(print_txt);
			    	}
			    	else {
			    		System.out.println("Test Fail");
			    	}
			} 
	
	}
			
			class Sub_Menus{
				
				/*
				 * Sub Menus
				 * Testing 
				 		* Selenium
				 		* Manual Testing
				 		* DB Testing
				 		* Unit Testing
				 * Java
				 		* Adv Java
				 		* Core Java
				 		* Spring 
				 		* Hibernate 
				 * .Net
				 		* C#
				 		* ASP.NET
				 		* ADO.NET
				 		* MVC 
				 * Data Base
				 		* SQL 
				 		* My Sql
				 		* Oracle 
				 		* H2 
				 */
				
				public void Sub_Menus_Tab() 
				{
					WebElement Tab_1 = driver.findElement(By.xpath("//*[contains(text(),'Sub Menus')]"));
				    String tab1 = Tab_1.getText().toString();
				    if(tab1.contains("Sub Menus")) 
				    {
				    	Tab_1.click();
				    }
				}
				
				
				class Testing{
					
					public void Testing_Software() {
						
						WebElement Testing = driver.findElement(By.xpath("//*[@class='dropbtn'][contains(text(),'Testing')]"));
						Testing.click();
						
					}				
					public void Selenium() 
					{
						WebElement Selenum = driver.findElement(By.id("selbtn"));
				    	String x = Selenum.getText().toString();
				    	if(x.equalsIgnoreCase("Selenium")) {
				    		Selenum.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Selenium')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void Manual_Testing() 
					{
						WebElement Manual = driver.findElement(By.id("manualbtn"));
				    	String x = Manual.getText().toString();
				    	if(x.equalsIgnoreCase("Manual Testing")) {
				    		Manual.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Manual Testing')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void DB_Testing() 
					{
						WebElement DB = driver.findElement(By.id("dbbtn"));
				    	String x = DB.getText().toString();
				    	if(x.equalsIgnoreCase("DB Testing")) {
				    		DB.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected DB Testing')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void Unit_Testing() 
					{
						WebElement unit = driver.findElement(By.id("unitbtn"));
				    	String x = unit.getText().toString();
				    	if(x.equalsIgnoreCase("Unit Testing")) {
				    		unit.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Unit Testing')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
			
			    	}
				class JAVA{
					
					public void java_Software() {
						
						WebElement java = driver.findElement(By.xpath("//*[@class='dropbtn'][contains(text(),'JAVA')]"));
						java.click();
						
					}
					public void Advance_Java() 
					{
						WebElement adv_java = driver.findElement(By.id("advjavabtn"));
				    	String x = adv_java.getText().toString();
				    	if(x.equalsIgnoreCase("Adv Java")) {
				    		adv_java.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Adv Java')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void core_Java() 
					{
						WebElement core_java = driver.findElement(By.id("corejavabtn"));
				    	String x = core_java.getText().toString();
				    	if(x.equalsIgnoreCase("Core Java")) {
				    		core_java.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Core Java')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void Spring() 
					{
						WebElement spring = driver.findElement(By.id("springbtn"));
				    	String x = spring.getText().toString();
				    	if(x.equalsIgnoreCase("Spring")) {
				    		spring.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Spring')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void Hibernate () 
					{
						WebElement Hibernate = driver.findElement(By.id("hibernatebtn"));
				    	String x = Hibernate.getText().toString();
				    	if(x.equalsIgnoreCase("Hibernate")) {
				    		Hibernate.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Hibernate')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
			
			    	}
				class dotNet{
					
					public void dotNet_Software() {
						
						WebElement dotnet = driver.findElement(By.xpath("//*[@class='dropbtn'][contains(text(),'Net')]"));
						dotnet.click();
						
					}		
					public void c_sharp() 
					{
						WebElement csharp = driver.findElement(By.id("cbtn"));
				    	String x = csharp.getText().toString();
				    	if(x.equalsIgnoreCase("C#")) {
				    		csharp.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected C#')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void ASP_net() 
					{
						WebElement asp_net = driver.findElement(By.id("aspbtn"));
				    	String x = asp_net.getText().toString();
				    	if(x.equalsIgnoreCase("ASP.NET")) {
				    		asp_net.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected ASP.NET')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void ADO_Net() 
					{
						WebElement ado = driver.findElement(By.id("adobtn"));
				    	String x = ado.getText().toString();
				    	if(x.equalsIgnoreCase("ADO.NET")) {
				    		ado.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected ADO.NET')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void MVC() 
					{
						WebElement mvc = driver.findElement(By.id("mvcbtn"));
				    	String x = mvc.getText().toString();
				    	if(x.equalsIgnoreCase("MVC")) {
				    		mvc.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected MVC')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
			
			    	}
				class DataBase{
					
					public void Database_Software() {
						
						WebElement Database = driver.findElement(By.xpath("//*[@class='dropbtn'][contains(text(),'Database')]"));
						Database.click();
						
					}			
					public void SQL() 
					{
						WebElement sql = driver.findElement(By.id("sqlbtn"));
				    	String x = sql.getText().toString();
				    	if(x.equalsIgnoreCase("SQL")) {
				    		sql.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected SQL')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void My_Sql() 
					{
						WebElement My_Sql = driver.findElement(By.id("mysqlbtn"));
				    	String x = My_Sql.getText().toString();
				    	if(x.equalsIgnoreCase("My SQL")) {
				    		My_Sql.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected My Sql')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void Oracle() 
					{
						WebElement Oracle = driver.findElement(By.id("oraclebtn"));
				    	String x = Oracle.getText().toString();
				    	if(x.equalsIgnoreCase("Oracle")) {
				    		Oracle.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected Oracle')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
				}
					public void H2() 
					{
						WebElement h2 = driver.findElement(By.id("h2btn"));
				    	String x = h2.getText().toString();
				    	if(x.equalsIgnoreCase("H2")) {
				    		h2.click();
				    		System.out.println("Test Pass");
				    		
				    		WebElement txt_output = driver.findElement(By.xpath("//span[contains(text(),'Selected H2 ')]"));
				    		String print_txt = txt_output.getText().toString();
				    		System.out.println(print_txt+"In Sub Menu Options");
				    	}
						    else 
					    	{
					    		System.out.println("Test Fail");
					    	}
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
		driver.findElement(By.xpath("//*[contains(text(),'Menu')]")).click();
		
		/*
		 * For Single Menus
		 */
		Testcase_15_More_Menu m = new Testcase_15_More_Menu();
		Testcase_15_More_Menu.more_Menu mt = m.new  more_Menu();
		Testcase_15_More_Menu.more_Menu.Single_Menus im = mt.new Single_Menus();
		
		
		im.Single_Menus_Tab();
		im.Testing();
		im.Java();
		im.net();
		im.Data_Base();
		
		
		
		Testcase_15_More_Menu.more_Menu.Sub_Menus sm = mt.new Sub_Menus();
		sm.Sub_Menus_Tab();
		
		
		/*
		  * For Testing Softwares
		  */
		Testcase_15_More_Menu.more_Menu.Sub_Menus.Testing Testing = sm.new Testing();
		Testing.Testing_Software();
		Testing.Selenium();
		Testing.Manual_Testing();
		Testing.DB_Testing();
		Testing.Unit_Testing();
		
		/*
		  * For Java Softwares
		  */
		Testcase_15_More_Menu.more_Menu.Sub_Menus.JAVA Java = sm.new JAVA();
		Java.java_Software();
		Java.Advance_Java();
		Java.core_Java();
		Java.Spring();
		Java.Hibernate();
		
		/*
		  * For dotNet Softwares
		  */
		Testcase_15_More_Menu.more_Menu.Sub_Menus.dotNet dotNet = sm.new dotNet();
		dotNet.dotNet_Software();
		dotNet.c_sharp();
		dotNet.ASP_net();
		dotNet.ADO_Net();
		dotNet.MVC();
		
		/*
		  * For Data Base Softwares
		  */
		Testcase_15_More_Menu.more_Menu.Sub_Menus.DataBase DataBase = sm.new DataBase();
		DataBase.Database_Software();
		DataBase.SQL();
		DataBase.My_Sql();
		DataBase.Oracle();
		DataBase.H2();
		
		driver.close();

	    }   
	}


