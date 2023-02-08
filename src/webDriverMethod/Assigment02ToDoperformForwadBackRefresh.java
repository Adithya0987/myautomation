package webDriverMethod;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;

public class Assigment02ToDoperformForwadBackRefresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http:www.Zomato.com");
		driver.navigate().to("http:www.Swiggy.com");
		//Navigation navigate = driver.navigate();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		

	}

}
