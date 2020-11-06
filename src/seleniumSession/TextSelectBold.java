package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextSelectBold {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calmlywriter.com/online/");
		driver.manage().window().maximize();
		driver.findElement(By.id("main")).sendKeys("Automation is Awesome");
		driver.findElement(By.id("main")).sendKeys(Keys.CONTROL+"a","b");
		//driver.findElement(By.id("main")).sendKeys(Keys.CONTROL+"b");
		//driver.findElement(By.id("main")).click();

	}

}
