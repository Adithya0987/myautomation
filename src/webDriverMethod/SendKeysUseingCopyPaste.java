package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUseingCopyPaste {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://affiliate.flipkart.com/login");
		driver.findElement(By.xpath("//input[@name=\"inputEmail\"]")).sendKeys("Sbadithya20@gmail.com",Keys.CONTROL+"A");
		driver.findElement(By.xpath("//input[@name=\"inputEmail\"]")).sendKeys(Keys.CONTROL+"C");
		driver.findElement(By.xpath("//input[@name=\"inputPassword\"]")).sendKeys(Keys.CONTROL+"V");
		driver.findElement(By.xpath("//input[@name=\"inputPassword\"]")).sendKeys(Keys.ENTER);
		

	}

}
