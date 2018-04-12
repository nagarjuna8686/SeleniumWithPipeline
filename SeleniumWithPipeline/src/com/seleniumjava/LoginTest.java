package com.seleniumjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
  @Test
  public void loginnewTest1() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://test.salesforce.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.id("username")).sendKeys("dsintegration-admin@servicesource.com.sitdelemea");
	  driver.findElement(By.id("password")).sendKeys("srevds123!");
	  driver.findElement(By.id("Login")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  String pTitle=driver.getTitle();
	  
	  System.out.println("Page Title is::" + pTitle);
	  
	  
  }
}
