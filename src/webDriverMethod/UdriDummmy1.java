package webDriverMethod;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdriDummmy1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.ducati.com");
		driver.get("http:www.fb.com");
		
		Navigation navigate =driver.navigate();
		navigate.back();
		navigate.refresh();
		navigate.forward();
		navigate.to("http:www.tvs.com");
		navigate.to("http:www.google.com");
		driver.quit();
		
		
		

	}

}
