package seleniumSession;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class SeleniumGridSetUp {

	static WebDriver driver;
	static String nodeUrl;
	public static void main(String[] args) throws MalformedURLException {
		
		nodeUrl= "http://192.168.0.106:44647/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		driver = new RemoteWebDriver(new URL(nodeUrl),cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		String currentTitle=driver.getTitle();
		String expectedTitle="Gmail";
		Assert.assertEquals(currentTitle, expectedTitle);
		driver.close();

	}

}
