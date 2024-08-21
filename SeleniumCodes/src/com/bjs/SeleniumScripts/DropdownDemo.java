package com.bjs.SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shadi.com/");
		 driver.findElement(By.linkText("Join Now")).click();;
		
		WebElement educationDropdown = driver.findElement(By.id("ddlEducation"));
		
		Select s = new Select(educationDropdown);
		//s.selectByIndex(1);
		//s.selectByValue("5");
		s.selectByVisibleText("MBBS");

		
        
// Get all the options of the dropdown
List<WebElement> options = s.getOptions();
		
	}

}
