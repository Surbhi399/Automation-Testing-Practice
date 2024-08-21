package com.bjs.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameDemo {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	//WebElement username = driver.findElement(By.className("inputtext"));
	//username.sendKeys("jainsurbhi399@gmail.com");

	//WebElement ForgetPassword = driver.findElement(By.partialLinkText("Forgotten password?"));
	//ForgetPassword.click();
	
	//WebElement username = driver.findElement(By.cssSelector("input#email"));
	//username.sendKeys("jainsurbhi399@gmail.com");
	//WebElement username = driver.findElement(By.cssSelector("input.inputtext"));
	//username.sendKeys("jainsurbhi399@gmail.com");
	
	//WebElement username = driver.findElement(By.cssSelector("input.inputtext[name = 'email']"));
	//username.sendKeys("jainsurbhi399@gmail.com");
	
	WebElement username = driver.findElement(By.cssSelector("input[name *= 'mai']"));
	username.sendKeys("jainsurbhi399@gmail.com");
	
	}

}
