package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");

		// step 1- Switch to the frame which has that particular table
		// step-2 Get the number of rows
		// step-3 Get the number of columns
		// Step-4 iterate rows and columns and get text and print it.
		// *[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		int rowCount = rows.size();
		System.out.println(rowCount);

		String beforeXpath = "//*[@id='leftcontainer']/table/tbody/tr[";
		String afterXpath = "]/td[1]";
		for (int i = 1; i <= rowCount; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			// Thread.sleep(5000);
			if (element.getText().equals("Aditya Birla Fashion")) {
				element.click();
				break;
			}
		}
		driver.close();
		Webtable();
	}

	public static void Webtable() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		int rowCount = rows.size();
		System.out.println(rowCount);

		String beforeXpath = "//*[@id='leftcontainer']/table/tbody/tr[";
		String afterXpath = "]/td[4]";
		float sum = 0f;

		for (int i = 1; i <= 10; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			String ele = driver.findElement(By.xpath(actualXpath)).getText();
			String ele1= ele.replace(",", "");
			float d = Float.parseFloat(ele1);
			
			ArrayList<Float> arr=new ArrayList<Float>();
			arr.add(d);
			
			for (float j : arr) {
				sum += j;
			
			}
			
		}
		
		System.out.println(sum);
	}

}
