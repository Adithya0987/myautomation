package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Car_URUS_02 {
	//@Parameters("browser")
	@Test(groups="smoke")
	public void URUSWhite() {
		WebDriver driver= null;

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
				driver.get("http:www.fb.com");

	}
}
