package com.bjs.SeleniumScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class PopupDemo {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
				

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://echoecho.com/javascript4.htm");
				
				
			WebElement alert = driver.findElement(By.name("B1"));
			alert.click();
			Alert a =		driver.switchTo().alert();
			Thread.sleep(2000);
			a.accept();
			Thread.sleep(2000);
			
			WebElement confirm = driver.findElement(By.name("B2"));
			confirm.click();
			Alert a1 =		driver.switchTo().alert();
			Thread.sleep(2000);
			a1.dismiss();
			
	
			WebElement prompt= driver.findElement(By.name("B3"));
			prompt.click();
			Alert a2 =		driver.switchTo().alert();
			Thread.sleep(2000);
			a2.sendKeys("nice work");
			System.out.println(a2.getText());
			//a2.accept();
			//Thread.sleep(5000);
			//driver.close();
			
			
	}

}
