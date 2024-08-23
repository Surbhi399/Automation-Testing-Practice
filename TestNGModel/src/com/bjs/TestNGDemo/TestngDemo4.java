package com.bjs.TestNGDemo;

import org.testng.annotations.Test;

public class TestngDemo4 {
	@Test(groups = "compose")
	public void test_1()
	{
		System.out.println("test_1 is executed for group compose");
	}
	@Test(groups = "compose")
	public void test_2()
	{
		System.out.println("test_2 is executed for group compose");
	}
	@Test( priority = 1,groups = "inbox")
	public void test_3()
	{
		System.out.println("test_3 is executed for group inbox");
	}
	@Test( priority = 2,groups = "inbox")
	public void test_4()
	{
		System.out.println("test_4 is executed for group inbox");
	}
	
	@Test(groups = "logout")
	public void test_5()
	{
		System.out.println("test_5 is executed for group logout");
	}

}
