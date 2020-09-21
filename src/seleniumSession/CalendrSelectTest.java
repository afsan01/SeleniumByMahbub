package seleniumSession;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendrSelectTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
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
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();

		String date = "18-September-2019"; //it can change as per need with different date.
		String dateArr[] = date.split("-");// 18,September,2019
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select select = new Select(driver.findElement(By.name("slcMonth")));
		select.selectByVisibleText(month);
		Select select1 = new Select(driver.findElement(By.name("slcYear")));
		select1.selectByVisibleText(year);

		String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td";

		final int totalWeekDays = 7;

		// 2-1 2-3
		boolean flag =false;
		String dayVal=null;
		for (int rowNum = 2; rowNum <= 7; rowNum++) {
			for (int colNum = 1; colNum <= totalWeekDays; colNum++) {
				try {
			    dayVal = driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).getText();
				}catch (NoSuchElementException e) {
					System.out.println("Please enter a correct date value");
					flag =false;
					break;
				}
				System.out.println(dayVal);
				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).click();
					flag=true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}

	}

}
