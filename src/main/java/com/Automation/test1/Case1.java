package com.Automation.test1;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Case1 implements Propertes {

	public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
	
    String[] urls = (links);
	         /*  for (String url : urls) 
	           {   
	               driver.get(url);
	                
	               // Add some delay to see the page loading
	               
	               try {
		                   Thread.sleep(2000);
		               } catch (InterruptedException e) {
		                   e.printStackTrace();
		               }
	                   caputcher(driver);
	           }
	           
	           driver.quit();
	           */
	             
	           WebDriver driver1= new FirefoxDriver();	

	           driver1.manage().window().maximize();
	           driver1.get("https://www.getcalley.com/page-sitemap.xml");
	               
				for (String url1 : urls) {
		               driver1.get(url1);
		               // Add some delay to see the page loading
		               try {
		                   Thread.sleep(2000);
		               } catch (InterruptedException e) {
		                   e.printStackTrace();
		               }
		               caputcher(driver1);
	               }
	               
	               driver1.quit(); 
	               
	           	WebDriver driver2= new EdgeDriver();
	               
	               driver2.manage().window().maximize();
		           driver2.get("https://www.getcalley.com/page-sitemap.xml");
		               for (String url1 : urls) {
			               driver2.get(url1);
			               // Add some delay to see the page loading
			               try {
			                   Thread.sleep(2000);
			               } catch (InterruptedException e) {
			                   e.printStackTrace();
			               }
		               
			               
			               
			               caputcher(driver2);
		               }
		               
		               driver2.quit();    
		
		}

	public static void caputcher(WebDriver driver) throws IOException 
	{   
	    int screenshotNumber = 1;
	    while (screenshotNumber <=5) {
	         String screenshotName = "screenshot" + screenshotNumber + ".jpeg";
	       
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       File destFile = new File("./Screenshorts/"+ screenshotName);     
	       FileUtils.copyFile(screenshot, destFile);
	    
	       
	    
	    }
	    screenshotNumber++;
		
	}
		
		
	}
	

