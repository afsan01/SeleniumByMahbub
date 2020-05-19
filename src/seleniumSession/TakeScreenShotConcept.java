package seleniumSession;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenShotConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait:
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com/");
		
		//Take screenshot and store as file format
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshoot to desired location using copuFile//method
		//FileUtils.copyFiles(src, new File("C:\\Users\\alvee\\eclipse-workspace\\SeleniumWebdriverNaveen/google.png"))
		
	}

}
