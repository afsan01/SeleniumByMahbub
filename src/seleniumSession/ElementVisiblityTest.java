package seleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisiblityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.freecrm.com/");
		// dynamic wait:
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		
		//1. isDisplayed() method applicable for all the elements
		 boolean b1 =driver.findElement(By.name("action")).isDisplayed();
		 System.out.println(b1);//true
		 
		 //2. isEnabled() method:
		 boolean b2 =driver.findElement(By.name("action")).isEnabled();
		 System.out.println(b2);
		 
		 //select I Agree checkbox
		// driver.findElement(By.name("terms")).click();
		 //boolean b3 =driver.findElement(By.name("action")).isEnabled();
		 //System.out.println(b3);
		 
		 //3. IsSelected() method: only applicable for Checkbox, dropdown, radiobutton
		 boolean b4= driver.findElement(By.name("terms")).isSelected();
		 System.out.println(b4);
		 
		 //de-selected the checkbox
		 driver.findElement(By.name("terms")).click();
		 boolean b5= driver.findElement(By.name("terms")).isSelected();
		 System.out.println(b5);

	}

}
