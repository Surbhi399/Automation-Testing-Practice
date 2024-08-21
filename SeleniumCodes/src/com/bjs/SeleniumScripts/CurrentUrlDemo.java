package com.bjs.SeleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrlDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver.driver", "\"C:\\Users\\jains\\OneDrive\\Desktop\\SeleniumComponents\\chromedriver_win32\\chromedriver.exe\"");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.gmail.com");
		String actualResult = driver.getCurrentUrl();
		System.out.println(actualResult);
		
		
		if( actualResult.equals( "https://accounts.google.com/v3/signin/identifier?dsh=S-1073622860%3A1686737176867697&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ffgf=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=Af_xneG-UMJ-bdOG-cv7mFCbJGHDb4fIP9sTPEUn7BWeBh3fY0AoHf8ThGdlopGxYvvAgnMp4VhxlQ&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin"))	{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	String title =	driver.getTitle();
	System.out.println(title);
	if( title.equals("Gmail"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	driver.manage().window().maximize();
	}
	

}
