package com.bjs.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDem {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jains/OneDrive/Desktop/javaSelenium/Login.html");
		
		WebElement username = driver.findElement(By.xpath("html/body/input[1]"));
		username.sendKeys("Admin");


		WebElement pwd = driver.findElement(By.xpath("html/body/input[2]"));
		pwd.sendKeys("12345678");
	}
	}

