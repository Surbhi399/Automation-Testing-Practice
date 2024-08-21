package com.bjs.SeleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingBooleanOperation {

	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shadi.com/");
	driver.findElement(By.linkText("Join Now")).click();
	
	
	WebElement female = driver.findElement(By.xpath("(//label[text()= 'Female'])[1]"));
	if(female.isDisplayed())
	{
		System.out.println("Female is displayed in Gender");
	}
	else 
	{
		System.out.println("Female is not displayed in Gender");	
	}
	
	//Thread.sleep(2000);
	
	/*WebElement male1 = driver.findElement(By.xpath("(//label[text()= 'Male'])[1]"));
	
	if(male1.isSelected())
	{
		System.out.println("Male is Selected for looking");
	}
	else 
	{
		System.out.println("Male is not Selected for looking");	
	}
	
	/*WebElement male = driver.findElement(By.xpath("(//label[text()= 'Male'])[2]"));
			
	if(male.isDisplayed())
	{
		System.out.println("Male is displayed in Gender");
	}
	else 
	{
		System.out.println("Male is not displayed in Gender");	
	}
	
Thread.sleep(2000);*/
	
	WebElement female1 = driver.findElement(By.xpath("(//label[text()= 'Female'])[2]"));
			
	
	if(female1.isSelected())
	{
		System.out.println("Female  is Selected for looking");
	}
	else 
	{
		System.out.println("Female is not Selected for looking");	
	}
	
	}
	
	

}
