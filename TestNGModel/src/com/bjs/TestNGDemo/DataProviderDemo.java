package com.bjs.TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	@DataProvider(name = "credentail")
	public Object[][] dataprovider()
	{
	Object [][]  obj = new Object [2][2];	
	obj[0][0] = "Admin";
	obj[0][1] = "admin123";
	
	obj[1][0] = "Admin";
	obj[1][1] = "admin1234";
	
	return obj;
	}
	@Test(dataProvider = "credentail")
	public void dataCredentail(String username,String password)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		
	}
	

}
