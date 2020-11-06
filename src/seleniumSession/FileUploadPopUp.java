package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		
		//type="file" should be present for Browse/AttachFile/Upload file button.
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\alvee\\Desktop\\Interview materials\\Capture.PNG");
	}

}
