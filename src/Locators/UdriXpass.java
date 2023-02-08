package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdriXpass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		driver.findElement(By.xpath("//div[@class="mNcDk bpLs1b\"]")).click();
		driver.quit();
	}

}
