package seleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement root=driver.findElement(By.tagName("book-app"));//shadow host/root element
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement shadowDom1 = (WebElement)js.executeScript("return arguments[0].shadowRoot", root);
		
		WebElement appHeader=shadowDom1.findElement(By.tagName("app-header"));
		WebElement apptoolbar=appHeader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		WebElement bookinputdecorator= apptoolbar.findElement(By.tagName("book-input-decorator"));
		bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Testing");
		
	}

}
