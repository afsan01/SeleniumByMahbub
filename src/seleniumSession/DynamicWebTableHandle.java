package seleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

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
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		//Method no 1
		/*String before_xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String after_xpath ="]/td[2]";
		
		for(int i=1; i<=4; i++) {
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
			
			if(name.contains("Rabeya Rahman")) {
				driver.findElement(By.xpath("(//input[@name ='id'])[3]")).click();
			}
			
		}*/
		//method2:
		driver.findElement(By.xpath("//a[contains(text(),'Rabeya Rahman')]/parent::td//preceding-sibling::td//input[@name='id']")).click();
	}
	
}
