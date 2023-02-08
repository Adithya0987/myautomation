package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkONFireLawn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.firelawn.com/");
		driver.findElement(By.xpath("//a[text()='Electronic']")).click();
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//span[text()='5.0']/../.././/img[@alt='APPLE iPhone 14 Pro']")).click();
//driver.quit();
	}

}
