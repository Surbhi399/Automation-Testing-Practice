package bjs.com.hrmOrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOrangeHrm {
	WebDriver driver;
	
	@FindBy(xpath =("//input[@name='username']"))
	WebElement username;
	@FindBy(xpath =("//input[@name='password']"))
	WebElement password;
	@FindBy(xpath =("//button[text()=' Login ']"))
	WebElement login;
	
	public LoginPageOrangeHrm(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void typeUsername()
	{
		username.sendKeys("Admin");
		
		
	}
	public void typePassword()
	{
		password.sendKeys("admin123");
	}
	public void clickOnLogin()
	{
		login.click();
	}

}
