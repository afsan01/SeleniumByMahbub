package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//1.FF driver
		//geckodriver
		/*System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe" );
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/");*/
		
		//2.chrome browser:
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();	
			driver1.get("https://www.google.com/");
			driver1.getTitle();
			String title = driver1.getTitle();//get title
			System.out.println(title);
			
			//validation point
			if(title.equals("Google")) {
				System.out.println("correct title");
			}
			else {
				System.out.println("in-correct title");
			}
			System.out.println(driver1.getCurrentUrl());
			//System.out.println(driver1.getPageSource());
			driver1.quit();

	}

}
