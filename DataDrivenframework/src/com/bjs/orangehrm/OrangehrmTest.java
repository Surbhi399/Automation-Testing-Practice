package com.bjs.orangehrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis =	new FileInputStream("C:\\Users\\jains\\OneDrive\\Desktop\\javaSelenium\\DataDrivenframework\\src\\com\\bjs\\utilities\\datadriven.properties");
			Properties p = new Properties();
			p.load(fis);
			
			String url = p.getProperty("url");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
driver.get(url);
	
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		login.click();

	}

}
