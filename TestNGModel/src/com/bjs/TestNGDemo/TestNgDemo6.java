package com.bjs.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo6 
{
	@Test
	public void  login()
	{
		// we use Assert : Whenever we want to intentionally fail a test case.
		
		
		Assert.fail();   
		System.out.println("Login successfully");
	}
	
//Whenever we want to execute a test case, multiple number of time. We should use the invocation count.

	
	@Test(invocationCount = 3)
	public void  compose()
	{
		System.out.println("Compose successfully");
	}
	@Test(enabled = false) //When we have to hide a particular test case. We should use enabled = false  .

	public void  inbox()
	{
		System.out.println("Inbox successfully");
	}
	
	// whenever we want to execute a test case irrespective of  whether the dependent test case is pass or fail.
	//Whenever we have to make a test case dependent on another test case. We should using dependsOnMethods.
	
	@Test(dependsOnMethods = "login",alwaysRun = true) 
	public void  logout()
	{
		System.out.println("Logout successfully");
	}

}
