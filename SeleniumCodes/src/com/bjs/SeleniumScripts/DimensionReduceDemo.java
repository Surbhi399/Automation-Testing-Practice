package com.bjs.SeleniumScripts;


//import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DimensionReduceDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		Dimension dim = driver.manage().window().getSize();
		System.out.println("Width of window is " + dim.width);
		System.out.println("Height of window is " + dim.height);
		Dimension newDim = new Dimension(dim.width/2, dim.height/2);
		
		System.out.println("Width of window is " + newDim.width);
		System.out.println("Height of window is " + newDim.height);
		
		driver.manage().window().setSize(newDim);
	}

}
