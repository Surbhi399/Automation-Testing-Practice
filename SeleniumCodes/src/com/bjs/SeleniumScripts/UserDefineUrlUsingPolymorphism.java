package com.bjs.SeleniumScripts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UserDefineUrlUsingPolymorphism {

	public static void main(String[] args) throws InterruptedException{
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
	public static void test(WebDriver driver) throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https:\\www.gmail.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		String Url= driver.getCurrentUrl();
		System.out.println(Url);
		
		Thread.sleep(5000);
		driver.close();
	}}
