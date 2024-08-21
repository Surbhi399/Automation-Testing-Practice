package com.bjs.SeleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		
		Actions a = new Actions(driver);
		
		//a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("bjshub").keyUp(Keys.SHIFT).pause(2000).keyDown(Keys.ENTER).build().perform();
		
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("amazon.in").keyUp(Keys.SHIFT).pause(2000).keyDown(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
				 driver.getWindowHandle();
		 driver.switchTo().window("https://www.google.com/search?q=AMAZON%3EIN&source=hp&ei=CfmbZNHbKYX4-Qa2tYOoDA&iflsig=AOEireoAAAAAZJwHGZC80oaqU6RRikTa7srEdnQTArw1&ved=0ahUKEwiRhJCmz-X_AhUFfN4KHbbaAMUQ4dUDCAk&uact=5&oq=AMAZON%3EIN&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAEIAEMgcIABCABBAKMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyDQgAEIAEELEDEIMBEAoyBQgAEIAEMgUIABCABDoQCAAQAxCPARDqAhCMAxDlAlAdWFJgqhBoAXAAeAKAAdMBiAGXBpIBBTAuMi4ymAEAoAEBsAEK&sclient=gws-wiz");
		 WebElement link = driver.findElement(By.linkText("India's largest online store - Great deals & prices everyday"));

		link.click();
		Thread.sleep(2000);
	}

}
