package seleniumSession;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterConcept {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.freecrm.com/");
		// dynamic wait:
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// System.out.println("Before login title is "+driver.getTitle());
		driver.findElement(By.xpath("//span[contains(text(), 'Log In')]")).click();

		driver.findElement(By.name("email")).sendKeys("afsan0403@gmail.com");
		driver.findElement(By.name("password")).sendKeys("al112101");
		// driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		// System.out.println("After login title is "+driver.getTitle());

		WebElement loginBtn = driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]"));
		flash(loginBtn, driver);// highlight the element
		drawBorder(loginBtn, driver);// draw the border

		// take screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(
				"C:\\Users\\alvee\\eclipse-workspace\\SeleniumWebdriverNaveen\\src\\seleniumSession\\element.png"));

		//click on any element by using JS executer
		clickElementByJS(loginBtn, driver);
		
		//Browser refresh by JS
		refreshBrowserByJS(driver);
		
		//get title by JS
		System.out.println(getTitleByJS(driver));
		
		//get the page text
		System.out.println(getPageInnerTest(driver));
		
		//scroll page down
		//scrollPageDown(driver);
		
		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
		scrollIntoView(forgotPwdLink,driver);
		
		// generate alert
		//generateAlert(driver, "There is an issue with Login page");
		//driver.switchTo().alert().accept();
		// driver.quit();
	}

	// executeScript -- to execute JavaScript code

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroudColor");
		for (int i = 0; i < 50; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

		}

	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowserByJS( WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;

	}
	//get page inner text
	public static String getPageInnerTest (WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].scrollIntoView(true);", element);

	}
	

}
