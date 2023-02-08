package JavaScrpitExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScroolIntoView {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.foundit.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 WebElement driv = driver.findElement(By.xpath("//a[text()='info@foundit.in']"));

		js.executeScript("arguments[0].scrollIntoView(true)",driv);
	}

}
