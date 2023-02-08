package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11Work {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		Thread.sleep(2000);
		driver.switchTo().frame(null)
		driver.findElement(By.xpath("//input[@id=\"regEmail\"]")).sendKeys("9448141962");

	}

}
