package seleniumSession;

import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWithEncryptedPassword {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.nopcommerce.com/login");
		Dimension d = new Dimension (260,292);
		driver.manage().window().setSize(d);;
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys(decodeString("dGVzdDEyMw=="));
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	
	public static String decodeString(String password) {
		byte[] decodedString = Base64.decode(password);
		return(new String(decodedString));
	}

}
