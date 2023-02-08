package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe.");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[class=\'ico-register\']")).click();
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		driver.findElement(By.cssSelector("input[name=\"FirstName\"]")).sendKeys("Adithya");
		driver.findElement(By.cssSelector("input[name=\"LastName\"]")).sendKeys("SB");
		driver.findElement(By.cssSelector("input[name=\"Email\"]")).sendKeys("Sbadithya8@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"Password\"]")).sendKeys("Adithya@123456");
		driver.findElement(By.cssSelector("input[name=\"ConfirmPassword\"]")).sendKeys("Adithya@123456");
		driver.findElement(By.cssSelector("input[name=\"register-button\"]")).click();

	}

}
