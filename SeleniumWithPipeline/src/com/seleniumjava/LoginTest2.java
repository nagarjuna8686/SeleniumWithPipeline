package com.seleniumjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest2 {
	public static WebDriver driver;
  @Test
  public void loginTest2() {
	  
	  System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://test.salesforce.com/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.id("username")).sendKeys("dsintegration-admin@servicesource.com.sitdell1p");
	  driver.findElement(By.id("password")).sendKeys("srevds123!");
	  driver.findElement(By.id("Login")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  String pTitle=driver.getTitle();
	  
	  System.out.println("Page Title is::" + pTitle);
	  
	  
  }
}
