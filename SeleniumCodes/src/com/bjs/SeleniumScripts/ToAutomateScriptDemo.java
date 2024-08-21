package com.bjs.SeleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomateScriptDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "\"C:\\Users\\jains\\OneDrive\\Desktop\\SeleniumComponents\\chromedriver_win32\\chromedriver.exe\"");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.gmail.com");
		Thread.sleep(5000);
		driver.close();

	}

}
