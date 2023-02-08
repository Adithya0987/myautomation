package JavaScrpitExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDisabledButtonAndTextBox {

	public static void main(String[] args) {
		//==================disabled Text===================//
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement drive = driver.findElement(By.xpath("//input[@class=\'form-control']"));
		js.executeScript("arguments[0].value='Adithya'",drive);*/
		//==================disabled Button===============//
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("")
		
	}

}
