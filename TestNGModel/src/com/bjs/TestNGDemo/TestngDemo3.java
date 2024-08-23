package com.bjs.TestNGDemo;

import org.testng.annotations.Test;

public class TestngDemo3 {
	@Test
	public void a()
	{
		System.out.println("a");
	}
	@Test( priority = 1)
	public void b()
	{
		System.out.println("b");
	}
	@Test( priority = 1)
	public void c()
	{
		System.out.println("c");
	}
	@Test( priority = 2)
	public void d()
	{
		System.out.println("d");
	}
	
	@Test
	public void e()
	{
		System.out.println("e");
	}

}
