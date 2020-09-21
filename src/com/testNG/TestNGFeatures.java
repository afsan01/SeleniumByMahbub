package com.testNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i =9/0;
	}

	@Test(dependsOnMethods="loginTest")
	public void homepageTest() {
		System.out.println("HomePage Test");
	}
	
	@Test
	public void SearchPageTest() {
		System.out.println("Login Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void regisPageTest() {
		System.out.println("Login Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void urlpageTest() {
		System.out.println("Login Test");
	}
}
