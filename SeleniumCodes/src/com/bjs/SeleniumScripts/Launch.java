package com.bjs.SeleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String args [])
	{
	System.setProperty("webdriver.chromedriver.driver", "\"C:\\Users\\jains\\OneDrive\\Desktop\\SeleniumComponents\\chromedriver_win32\\chromedriver.exe\"");
	ChromeDriver driver = new ChromeDriver();
	}

}
