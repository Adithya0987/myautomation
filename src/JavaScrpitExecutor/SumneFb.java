package JavaScrpitExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SumneFb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.get("http:www.fb.com");
			driver.switchTo().activeElement().sendKeys("Adithya");
			Thread.sleep(3000);
		
	}

}
