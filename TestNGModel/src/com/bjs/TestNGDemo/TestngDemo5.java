package com.bjs.TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo5 {
	@Test
	public void test_1()
	{
		System.out.println("test_1 is executed for group compose");
	}
	@Test
	public void test_2()
	{
		System.out.println("test_2 is executed for group compose");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}
	
	

}
