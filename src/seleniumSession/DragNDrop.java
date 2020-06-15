package seleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	public static WebDriver driver;
	public String baseurl = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";

	public void openUrl() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public void action1() throws Exception {
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("box7")).click();
		WebElement dragme = driver.findElement(By.id("box7"));
		WebElement dropme = driver.findElement(By.id("box107"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragme, dropme).perform();
		builder.build();
	}

	public void action2() throws Exception {
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("box1")).click();
		WebElement dragme1 = driver.findElement(By.id("box1"));
		WebElement dropme1 = driver.findElement(By.id("box101"));

		Actions builder1 = new Actions(driver);
		builder1.dragAndDrop(dragme1, dropme1).perform();
		builder1.build();

	}

	public void action3() throws Exception {
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("box2")).click();
		WebElement dragme2 = driver.findElement(By.id("box2"));
		WebElement dropme2 = driver.findElement(By.id("box102"));

		Actions builder2 = new Actions(driver);
		builder2.dragAndDrop(dragme2, dropme2).perform();
		builder2.build();
	}

	public void action4() throws Exception {
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("box3")).click();
		WebElement dragme3 = driver.findElement(By.id("box3"));
		WebElement dropme3 = driver.findElement(By.id("box103"));

		Actions builder3 = new Actions(driver);
		builder3.dragAndDrop(dragme3, dropme3).perform();
		builder3.build();
	}

	public void action5() throws Exception {
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("box4")).click();
		WebElement dragme4 = driver.findElement(By.id("box4"));
		WebElement dropme4 = driver.findElement(By.id("box104"));

		Actions builder4 = new Actions(driver);
		builder4.dragAndDrop(dragme4, dropme4).perform();
		builder4.build();
	}

	public void action6() throws Exception {
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("box5")).click();
		WebElement dragme5 = driver.findElement(By.id("box5"));
		WebElement dropme5 = driver.findElement(By.id("box105"));

		Actions builder5 = new Actions(driver);
		builder5.dragAndDrop(dragme5, dropme5).perform();
		builder5.build();
	}

	public void action7() throws Exception {
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("box6")).click();
		WebElement dragme6 = driver.findElement(By.id("box6"));
		WebElement dropme6 = driver.findElement(By.id("box106"));

		Actions builder6 = new Actions(driver);
		builder6.dragAndDrop(dragme6, dropme6).perform();
		builder6.build();

	}

	/*
	 * public void action_1() throws InterruptedException { Thread.sleep(500);
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * driver.findElement(By.id("box7")).click(); WebElement dragme =
	 * driver.findElement(By.id("box7")); WebElement dropme
	 * =driver.findElement(By.id("box107"));
	 * 
	 * Actions builder = new Actions(driver); builder.dragAndDrop(dragme,
	 * dropme).perform(); builder.build(); }
	 */
	public static void main(String[] args) throws Exception {
		DragNDrop test = new DragNDrop();
		test.openUrl();
		test.action1();
		test.action2();
		test.action3();
		test.action4();
		test.action5();
		test.action6();
		test.action7();

		Thread.sleep(5000);
		driver.quit();

	}
}
