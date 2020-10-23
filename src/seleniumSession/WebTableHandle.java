package seleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		int rowNumber = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
		System.out.println("Number of row:"+rowNumber);
		
		int colNumber = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		System.out.println("Number of column:"+colNumber);
		
		//String rowData = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1[/td[4]")).getText();
		//System.out.println("Data of row:"+rowData);
		
		String rowData = driver.findElement(By.xpath("//a[contains(text(),'Deepak Fertilisers')]/parent::*/following-sibling::td[2]")).getText();
		System.out.println("Data of row:"+rowData);
		
		
		driver.quit();
	}

}
