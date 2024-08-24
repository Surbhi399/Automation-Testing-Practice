package com.bjs.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bjs.com.hrmOrange.HomePageOrangeHrm;
import bjs.com.hrmOrange.LoginPageOrangeHrm;

public class OrangeHrmTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPageOrangeHrm l = new LoginPageOrangeHrm(driver);
		l.typeUsername();
		l.typePassword();
		l.clickOnLogin();
		
		HomePageOrangeHrm h = new HomePageOrangeHrm(driver);
		h.ClickOnOrangeHrmLink();
	}

}
