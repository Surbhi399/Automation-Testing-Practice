package com.bjs.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemoUsingConcatePipeOperator {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jains/OneDrive/Desktop/javaSelenium/pqrs.html");
		WebElement username = driver.findElement(By.xpath("html/body/div[1]/input[1]"));
		username.sendKeys("Admin");

	}

}
