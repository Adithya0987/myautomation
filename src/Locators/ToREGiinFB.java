package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class ToREGiinFB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.partialLinkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Adithya");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Sb");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("sbadithya9@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Adithya@123");
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("20");
		driver.findElement(By.cssSelector("select[id='month']")).sendKeys("Aug");
		driver.findElement(By.cssSelector("select[id="year"]"))
		
		
	}
	
}
