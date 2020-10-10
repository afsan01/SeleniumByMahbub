package seleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		
		ChromeOptions option =new ChromeOptions(); 
		option.addArguments("window-size=1400,800");
		option.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.freecrm.com/");
		// dynamic wait:
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(), 'Log In')]")).click();

		driver.findElement(By.name("email")).sendKeys("afsan0403@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Al112101");
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();;
		
		System.out.println("Home page title==" +driver.getTitle());

		
	}

}
