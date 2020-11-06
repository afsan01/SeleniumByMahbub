package seleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interview {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables#delete");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List <WebElement> rows= driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
		int rowCount=rows.size();
		System.out.println(rowCount);
		
		//*[@id="table1"]/thead/tr/th[4]
		//*[@id="table1"]/tbody/tr[1]/td[4]
		
		String beforeXpath="//*[@id='table1']/tbody/tr[";
		String afterXpah="]/td[4]";
		double sum=0;
		
		for(int i=1;i<rows.size()+1;i++) {
			String actualXpath= beforeXpath + i + afterXpah;
			String ele= driver.findElement(By.xpath(actualXpath)).getText();
			String ele1=ele.replace('$', '0');
			double d= Double.parseDouble(ele1);
		
			
			ArrayList<Double> arr =new ArrayList<Double>();
			arr.add(d);
			
			
			for(double val : arr) {
				sum+=val;
			}
			
		}
		System.out.println(sum);

	}

}
