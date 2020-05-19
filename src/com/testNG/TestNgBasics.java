package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
/*@BeforeSuite: setup system property for chrome
@BeforeTest: login method
@BeforeClass: Launch chrome browser

@BeforeMethod: enter URL
@Test: google Logo test
@AfterMethod: logout from app

@BeforeMethod: enter URL
@Test: Google Title Test
@AfterMethod: logout from app

@BeforeMethod: enter URL
@Test: Search test
@AfterMethod: logout from app

@AfterClass: close browse
@AfterTest: deleteAllCookies
	 * 
	 */
	
	//Pre-condition annotations--starting with @Before
	@BeforeSuite//1
	public void setUp() {
		System.out.println("@BeforeSuite: setup system property for chrome");
	}
	@BeforeTest//2
	public void login() {
		System.out.println("@BeforeTest: login method");
	}
	
	@BeforeClass//3
	public void launchBrowser() {
		System.out.println("@BeforeClass: Launch chrome browser");
	}
	@BeforeMethod//4
	public void enterURL() {
		System.out.println("@BeforeMethod: enter URL");
	}
	
	
	//test cases--starting with @Test
	@Test//5
	public void googleTitle() {
		System.out.println("@Test: Google Title Test");
	}
	@Test
	public void searchTest() {
		System.out.println("@Test: Search test");
	}
	
	@Test
	public void googleLogotest() {
		System.out.println("@Test: google Logo test");
	}
	@AfterMethod//6
	public void logOut() {
		System.out.println("@AfterMethod: logout from app");
	
	}
	
	//post conditions--starting with @After
	@AfterClass//7
	public void closeBrowser() {
		System.out.println("@AfterClass: close browse");
	}
	@AfterTest//8
	public void deleteAllCookies() {
		System.out.println("@AfterTest: deleteAllCookies");
	}
	
	@AfterSuite//9
	public void generateTestReport() {
		System.out.println("@AfterSuite: generate test report");
	}

}
