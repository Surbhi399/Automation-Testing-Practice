package com.bjs.SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https:\\www.gmail.com");
		Thread.sleep(5000);
		driver.close();
		String actualResult = driver.getCurrentUrl();
		System.out.println(actualResult);
		
		
	}

}
