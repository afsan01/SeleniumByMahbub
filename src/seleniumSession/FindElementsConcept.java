package seleniumSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait:
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
		
		//1. get the total link of the page
		//2. get the text of each link on the page
		
		 List <WebElement> linklist =driver.findElements(By.tagName("a"));
		 System.out.println(linklist.size());
		 
		 for(int i=0;i<linklist.size();i++) {
			String linkText=linklist.get(i).getText();
			System.out.println(linkText);
		 }
		 
	}

}
