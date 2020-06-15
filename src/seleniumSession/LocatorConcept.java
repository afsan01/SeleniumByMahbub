package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Tom");
		driver.findElement(By.name("lastname")).sendKeys("Peter");
		driver.findElement(By.id("address1")).sendKeys("8517 sabinas trl");
		driver.findElement(By.id("city")).sendKeys("Fort Worth");
		
		Select select = new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText("Texas");
		
		driver.findElement(By.id("zip")).sendKeys("76118");;
		driver.findElement(By.name("dayphone1")).sendKeys("817");
		driver.findElement(By.name("dayphone2")).sendKeys("290");
		driver.findElement(By.name("dayphone3")).sendKeys("0277");
		
		driver.findElement(By.name("email")).sendKeys("tompeter1@gmail.com");
		driver.findElement(By.name("retype_email")).sendKeys("tompeter1@gmail.com");
		driver.findElement(By.id("userid")).sendKeys("TomPeter");
		driver.findElement(By.id("PASSWORD")).sendKeys("to112101");
		driver.findElement(By.id("rpass")).sendKeys("to112101");
		
		Select sle = new Select(driver.findElement(By.id("SECRET_QUESTION")));
		sle.selectByVisibleText("What is your pet's name?");
		driver.findElement(By.name("myanswer")).sendKeys("Tommy");
		
		Select month = new Select(driver.findElement(By.name("birthdate2")));
		month.selectByVisibleText("May");
		Select day = new Select(driver.findElement(By.name("birthdate1")));
		day.selectByVisibleText("20");
		Select year = new Select(driver.findElement(By.name("birthdate3")));
		year.selectByVisibleText("1995");
		
		driver.findElement(By.id("acceptq1")).click();
		driver.findElement(By.id("continue")).click();
		
	}
	

}
