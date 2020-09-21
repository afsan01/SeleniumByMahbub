package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

//Add one extension.
//Go to Safari on upper left corner, go to preference add safari extention for selenium/ webdriver.
//Enable allow Remote Automation (Go to safari/ advanced/ select the checkbox (show develop menu in menu bar)
//Go to Develop menu from menu bar and select "Allow remote Automation"
 
public class SafariTest {

	public static void main(String[] args) {
		
		//No need to declare System.setProperty
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}
}
