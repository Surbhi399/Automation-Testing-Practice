package com.bjs.SeleniumScripts;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CountLinkForBookMyShowDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		
		
		List <WebElement> links =  driver.findElements(By.xpath("//a"));
		int size =links.size();
		System.out.println(size);
		
		
		
		for (WebElement link :links)
		{
			System.out.println(link.getText());
		}
		
	}

}
