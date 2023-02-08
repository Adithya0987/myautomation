package JavaScrpitExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHiddenElementsWork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:www.facebook.com");
		driver.findElement(By.partialLinkText("Create New Account")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("sbadithya4@gmail.com",Keys.ENTER);
	WebElement udri = driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
		js.executeScript("arguments[0].value='sbadithya4@gmail.com'",udri);
	}

}
