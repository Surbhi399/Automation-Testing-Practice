package com.bjs.TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
	@Test
	public void positiveCredential1()
	{
	System.out.println("positiveCredential1");	
	}
	@Test
	public void positiveCredential2()
	{
	System.out.println("positiveCredential2");	
	}
	@Test
	public void a()
	{
	System.out.println("a");	
	}
	@Test
	public void b()
	{
	System.out.println("b");
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

}
