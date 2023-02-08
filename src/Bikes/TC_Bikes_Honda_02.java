 package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Bikes_Honda_02 {
	//@Parameters("browser")
	@Test(groups="adhoc")
	public void Honda(@Optional("opera")String s) {
		WebDriver driver= null;
		if(s.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		driver=new ChromeDriver();
			driver.get("http:www.Honda.com");
		driver.quit();
		}
		if(s.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http:www.Honda.com");
			driver.quit();
		}
	}
}
		
	
	
	


