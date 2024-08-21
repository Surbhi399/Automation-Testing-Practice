package com.bjs.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.gmail.com");
		//WebElement email =  driver.findElement(By.id("identifierId"));
		//name="identifier"
		//WebElement email =  driver.findElement(By.name("identifier"));
		//email.sendKeys("jainsurbi399@gmail.com");
		WebElement email = driver.findElement(By.xpath("input[@name = 'email']"));
		email.sendKeys("jainsurbi399@gmail.com");

	}

}
