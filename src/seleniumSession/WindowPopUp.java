package seleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		//1. alerts--- JavaScript Pop UP--Alert API(accept, dissmiss)
		//2. File Upload pop up--- Browse button(type= file, sendKeys(path)
		//3. Browser Window pop up -- Advertisement pop up(Windowhandler API- getWindowHandles())
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		Thread.sleep(2000);
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it =handler.iterator();
		
		String ParentWindowId = it.next();
		System.out.println("Parent window id "+ ParentWindowId);
		
		String childWindowId=it.next();
		System.out.println("Child window id: "+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		
		System.out.println("child window pop title "+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		Thread.sleep(2000);
		System.out.println("parent window title "+driver.getTitle());

	}

}
