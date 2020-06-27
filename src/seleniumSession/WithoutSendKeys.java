package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendKeys {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
         driver.manage().window().maximize();
         WebElement send = driver.findElement(By.id("fromPlaceName"));
         ((JavascriptExecutor)driver).executeAsyncScript("arguments[0].value='kanigiri'",send);
		}
	}


