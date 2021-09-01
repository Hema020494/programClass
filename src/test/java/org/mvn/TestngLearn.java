package org.mvn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngLearn {
	@BeforeClass
	private void beforeClass()
	{
		System.out.println("@beforeclass");
	}
	@BeforeMethod
	private void beforeMethod()
	{
		System.out.println("@beforemethod");
	}
	@AfterMethod
	private void afterMethod()
	{
		System.out.println("@aftermethod");
	}
	@Test
	private void testing()
	{
		System.out.println("@test1");
	}
	@BeforeTest
	private void beforeTest()
	{
		System.out.println("@beforetest");
	}

}
