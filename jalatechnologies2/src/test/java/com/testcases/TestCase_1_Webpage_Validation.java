package com.testcases;

/*
 * @Bharatha_Bhaskar
 * @github: https://github.com/itsbhaskarshub
 * @bharathabhaskar1009@gmail.com
 * 
 * test case 001 for webpage validation 
 * 
 */
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase_1_Webpage_Validation {
	
	public static String url = "https://magnus.jalatechnologies.com/";
	public static String path = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
	public static String expected_title =  "JALA Academy";

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		
		driver.get(url);
		
		String webpage_title = driver.findElement(By.xpath("//b[contains(text(),'JALA Academy')]")).getText();
		
		if (expected_title.equalsIgnoreCase(webpage_title)) 
		{
			System.out.println("The Test is pass");
		}
		else 
		{
			System.out.println("The Test is Failed");
			TakesScreenshot ts =((TakesScreenshot)driver);
			ts.getScreenshotAs(OutputType.FILE);
		}
		
		driver.close();
	}
	
	
	
	
	

}
