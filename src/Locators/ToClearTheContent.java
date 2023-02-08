package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTheContent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webddriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Users&parent=Settings&view=Login&error=login");
		WebElement UserText = driver.findElement(By.xpath("//input[@name='username']"));
		Thread.sleep(2000);
		UserText.clear();
		UserText.sendKeys("Adithya",Keys.CONTROL+"A");
		UserText.sendKeys(Keys.CONTROL+"C");
		UserText.sendKeys(Keys.TAB);
		WebElement UserPass = driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(2000);
		UserPass.clear();
		UserPass.sendKeys(Keys.CONTROL+"V");
		UserPass.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		driver.findElement(By.xpath("//a[text()='forgot password?']")).click();
		

	}

}
