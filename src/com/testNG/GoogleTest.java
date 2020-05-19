package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://www.google.com");
	}
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2,groups= "Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//div[@id='logo-default']")).isDisplayed();
	}
	@Test(priority=3, groups="Link Test")
	public void mailLinkTest() {
		boolean b1 = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=4, groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=5, groups="Test")
	public void test2() {
		System.out.println("test1");
	}
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("test1");
	}
	
	
	@AfterMethod
	public void reardown() {
		driver.quit();
	}
}
