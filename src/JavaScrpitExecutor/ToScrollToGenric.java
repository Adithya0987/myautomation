package JavaScrpitExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollToGenric {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.foundit.in/");
		
			JavascriptExecutor js=(JavascriptExecutor) driver;
			int udri=1424;
			js.executeScript("window.scrollTo(0,arguments[0]);",udri);
			driver.findElement(By.xpath("//a[text()='info@foundit.in']")).click();


	}

}
