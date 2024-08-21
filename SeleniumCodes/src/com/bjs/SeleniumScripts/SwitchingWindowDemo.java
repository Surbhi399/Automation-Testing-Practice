package com.bjs.SeleniumScripts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindowDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/jains/OneDrive/Desktop/javaSelenium/page1.html");
		WebElement link = driver.findElement(By.linkText("GoToPage2"));
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		link.click();
		Thread.sleep(2000);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for(String s: allIds)
		{
			driver.switchTo().window(s);
		}
		WebElement link1 = driver.findElement(By.linkText("GoToPage3"));
		link1.click();
		Thread.sleep(2000);
	
	}

}
