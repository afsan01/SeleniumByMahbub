package seleniumSession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
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
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		
		//links---//a
		//images--//img
		
		//1. get  the list of all the links and images:
		List <WebElement> linkslist =driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of full links and images--->"+ linkslist.size());
		
		List <WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2.Iterate linkList: exclude all the links/images- doesent have any href attribute
		for(int i=0; i<linkslist.size();i++) {
			if(linkslist.get(i).getAttribute("href") !=null && (! linkslist.get(i).getAttribute("href").contains("javascript"))){
				activeLinks.add(linkslist.get(i));
			}
		}
		//get the size of active links
		System.out.println("size of active links and images---->"+ activeLinks.size());

		//3.check the herf url, with httpconnection api:
		for(int j=0;j<activeLinks.size();j++) {
			HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response =connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("herf")+"---->"+ response);
		}
		
	}

}
