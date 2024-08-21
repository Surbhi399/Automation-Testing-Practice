package com.bjs.SeleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_98xjxt98l7_e&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=15034507559094861182&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146606&hvtargid=kwd-316976916880&hydadcr=5841_2362028");

		WebElement ac = driver.findElement(By.xpath("//span[text() = 'Account & Lists']"));
		
		WebElement ya = driver.findElement(By.xpath("//span[text() = 'Your Account']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(ac).moveToElement(ya).click().build().perform();
	}

}
