package com.e2etesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {

	@Test
	
	public void loginTest()
	{
	
	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\Chrome\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://test.salesforce.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.findElement(By.id("username")).sendKeys("dsintegration-admin@servicesource.com.sitsiemens");
	  
	  driver.findElement(By.id("password")).sendKeys("srevds123!");
	  
	  driver.findElement(By.id("Login")).click();
	  
	  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	  
	  String pTitle=driver.getTitle();
	  
	  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	  System.out.println("Home Page Title is ::::" +pTitle);
	
	driver.quit();
	}
}
