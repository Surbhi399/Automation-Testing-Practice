package com.bjs.SeleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("file:///C:/Users/jains/OneDrive/Desktop/javaSelenium/first.html");
WebElement firstname = driver.findElement(By.id("fname"));
firstname.sendKeys("Rohit");

WebElement xpath = driver.findElement(By.xpath("//iframe[@id ='mname']"));
driver.switchTo().frame(0);

WebElement middle = driver.findElement(By.id("m"));
middle.sendKeys("Sharma");


	}

}
