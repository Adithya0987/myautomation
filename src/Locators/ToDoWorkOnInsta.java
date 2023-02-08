package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDoWorkOnInsta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("Adithya",Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.xpath("//input[@name=\"fullName\"]")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.quit();

	}

}
