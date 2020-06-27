package seleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.half.ebay.com/");
		//dynamic wait:
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='actextbox']")).sendKeys("Java");
		driver.findElement(By.xpath("//input[contains(@class,'actextbook']")).sendKeys("Java");
		
		//dynamic id
		//id=test_123
		//id=test_456
		//id =test_789
		//driver.findElement(By.xpath("//input[contains(@id, 'test_')]")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).sendKeys("test");
		//driver.findElement(By.xpath("//input[ends-with(@id, '_test_')]")).sendKeys("Test");
		
		//for links:
		//all the links are represented by<a> html tag.
		driver.findElement(By.xpath("//a[contains(text(),'Myaccount')]")).click();

	}

}
