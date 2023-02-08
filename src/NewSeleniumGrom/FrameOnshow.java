package NewSeleniumGrom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameOnshow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://snowcityblr.com/contact-us/");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[contains(@loading,\"lazy\")]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//div[contains(text(),'Directions')]")).click();
		driver.quit();
	}

}
