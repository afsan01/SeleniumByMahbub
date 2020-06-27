package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleChatBot1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@name='intercom-launcher-frame']")));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("intercom-launcher-frame")));

		//Thread.sleep(10000);
		//driver.switchTo().frame("intercom-launcher-frame");
		//driver.findElement(By.xpath("//div[contains(@class,'intercom-dlvlg4 e2ujk8f1')]")).click();
		driver.findElement(By.id("intercom-container")).click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(locator))
		
	}

}
