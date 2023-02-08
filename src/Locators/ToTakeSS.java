package Locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToTakeSS {

public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.ducati.com");
		Thread.sleep(2000);
		
		TakesScreenshot t1 =(TakesScreenshot) driver;
	WebDriverWait explictwait=new WebDriverWait(driver, 10);
		File pic3 = driver.findElement(By.xpath("//img[@itemprop=\"logo\"]")).getScreenshotAs(OutputType.FILE);
			 File pic1 = new File("./ErrorPic/Adi6.png");
			 Thread.sleep(4000);
			 FileHandler.copy(pic3, pic1);
	}

}
