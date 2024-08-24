package bjs.com.hrmOrange;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis  = new FileInputStream("C:\\Users\\jains\\OneDrive\\Desktop\\javaSelenium\\HybridDrivenFramework\\src\\com\\bjs\\utilities\\hybrid.properties") ;
		Properties p = new Properties();
		p.load(fis);
		String url =p.getProperty("url");
		String username =p.getProperty("username");
		String pwd =p.getProperty("password");
		String Loginkey =p.getProperty("LoginKey");
		String usernamekey =p.getProperty("usernameKey");
		String pwdkey =p.getProperty("passwordKey");
		System.out.println(url);
		System.out.println(username);
		System.out.println(pwd);
		System.out.println(Loginkey);
		System.out.println(usernamekey);
		System.out.println(pwdkey);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.findElement(By.xpath(usernamekey)).sendKeys(username);
		driver.findElement(By.xpath(pwdkey)).sendKeys(pwd);
		driver.findElement(By.xpath(Loginkey)).click();
		
	}

}
