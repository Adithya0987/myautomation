package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapFramesWorks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com");
		driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
		WebElement iframeelement = driver.findElement(By.xpath("//iframe[@name=\"app\"]"));
		driver.switchTo().frame(iframeelement);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		

	}

}
