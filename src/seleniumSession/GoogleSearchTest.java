package seleniumSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		// dynamic wait:
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		//use of descendant
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		System.out.println("Total number of suggestion in search box:::==>" +list.size());
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing mom")) {
				list.get(i).click();
				break;
			}
		}
	}

}
