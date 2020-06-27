package seleniumSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFiles {
 
	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\alvee\\eclipse-workspace\\SeleniumWebdriverByMahbub\\src\\seleniumSession\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url=prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")){
		 System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		 	driver = new FirefoxDriver();
	}
		else if(browserName.equals("IE")) {
			System.setProperty("webdriver.IE.driver", "C:\\Driver\\internetexplorerdriver.exe");
			driver =new InternetExplorerDriver();
		}
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys("firstName");
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys("lastName");
		driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys("city");

	
	}
}
