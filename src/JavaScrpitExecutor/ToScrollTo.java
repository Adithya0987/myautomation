package JavaScrpitExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.foundit.in/");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	driver.findElement(By.xpath("//a[text()='info@foundit.in']")).click();
		

	}

}
