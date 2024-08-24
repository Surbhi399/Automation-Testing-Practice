package bjs.com.hrmOrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageOrangeHrm {
	
	WebDriver driver;
	@FindBy(xpath =("//a[text() ]"))
	WebElement orangehrm;
	
	public HomePageOrangeHrm(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}
	
public void ClickOnOrangeHrmLink()
{
	orangehrm.click();
}
}
