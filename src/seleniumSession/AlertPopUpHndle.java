package seleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHndle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Dimension d = new Dimension (260,292);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		Alert alert =driver.switchTo().alert();
		alert.getText();
		System.out.println(alert.getText());
		
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("In-correct message");
		}
		alert.accept();
		
	}

}
