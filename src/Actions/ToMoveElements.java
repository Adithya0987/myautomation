package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement Men = driver.findElement(By.xpath("//span[contains(text(),\"Men's Fashion\")]"));
			Actions action = new Actions(driver);
			//action.moveToElement(Men).perform();
			//action.moveByOffset(162,164).perform();
			action.moveToElement(Men,0,27).perform();
						}

}
