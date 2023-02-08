package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Car_Lambo_03 {
	
	@Test(groups="smoke")
	public void Lambo() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http:www.lambrogrini.com");

	}

}
