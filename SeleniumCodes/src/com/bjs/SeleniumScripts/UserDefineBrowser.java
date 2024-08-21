package com.bjs.SeleniumScripts;

import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UserDefineBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Enter the browser :");
		Scanner scan = new Scanner(System.in);
		String browser = scan.next();
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			ChromeDriver c = new ChromeDriver();
			test(c);	
		}
		else
		{
			EdgeDriver ed = new EdgeDriver();
			test(ed);
		}
	}
	public static void test(ChromeDriver driver) throws InterruptedException
	{
		driver.get("https:\\www.gmail.com");
		String ctitle = driver.getTitle();
		System.out.println(ctitle);
		
		String cUrl= driver.getCurrentUrl();
		System.out.println(cUrl);
		
		Thread.sleep(5000);
		driver.close();
	}
	public static void test(EdgeDriver driver) throws InterruptedException
	{
		driver.get("https:\\www.gmail.com");
		String etitle = driver.getTitle();
		System.out.println(etitle);
		
		String eUrl= driver.getCurrentUrl();
		System.out.println(eUrl);
		Thread.sleep(3000);
		driver.close();
	}

}