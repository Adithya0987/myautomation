package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSwitchOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sbadi/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		
		String expectedPageTitle="Original Italian Recipes - Giallozafferano Recipes";
		/*Set<String> allWindowsId=driver.getWindowHandles();
		for(String windowIds:allWindowsId) {
			driver.switchTo().window(windowIds);
			String actualPageTitle=driver.getTitle();
			if(expectedPageTitle.equals(actualPageTitle)) {
				driver.manage().window().maximize();
				break;*/
			}
			
		
		
	}	


	}


