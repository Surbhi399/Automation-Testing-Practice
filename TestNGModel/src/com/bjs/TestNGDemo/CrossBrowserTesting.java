package com.bjs.TestNGDemo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
public class CrossBrowserTesting {
	
	WebDriver driver;
@Parameters({"browser"})	
@BeforeMethod
public void BeforeMethod(String browser)
{
	if(browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
		
	}
	else
	{
		driver = new EdgeDriver();
	}
		}

@Test

 public void TestCases() 
 {
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[text()=' Login ']")).click();
 }

}
