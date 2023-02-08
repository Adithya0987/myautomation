package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkOngoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com");
		driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys("How to be Quiet",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-hveid='CAIQBA']")).sendKeys(Keys.ENTER);
		driver.quit();
	}

}
