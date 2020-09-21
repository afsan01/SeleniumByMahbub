package seleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement root=driver.findElement(By.tagName("shop-app"));//root node/shadow host
		WebElement shadowDom1=getShadowDom(root,driver);
		WebElement ironpages=shadowDom1.findElement(By.tagName("iron-pages"));
		WebElement shophome=ironpages.findElement(By.name("home"));
		
		WebElement shadowDom2= getShadowDom(shophome,driver);
		shadowDom2.findElement(By.cssSelector("div:nth-child(3)>shop-button>a")).click();
		
	}
	
	static WebElement getShadowDom(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement shadowDom1 = (WebElement)js.executeScript("return arguments[0].shadowRoot", element);
		return shadowDom1;
	}

}
