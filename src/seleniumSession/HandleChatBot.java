package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChatBot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@id='corover-close-btn']"));
		
		System.out.println("Found Chat bot");
		
		if(element.size()>0) {
			element.get(0).click();
			System.out.println("Closing Chat bot");

		}

	}

}
