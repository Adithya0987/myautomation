package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocatorTheWebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		 WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		 LoginLink.click();
		 Thread.sleep(2000);
		 WebElement EnterEmail = driver.findElement(By.id("Email"));
		 EnterEmail.sendKeys("sbadithya4@gmail.com");
		 Thread.sleep(2000);
		 WebElement EnterPassword = driver.findElement(By.id("Password"));
		 EnterPassword.sendKeys("Adithya@13");
		

	}

}
