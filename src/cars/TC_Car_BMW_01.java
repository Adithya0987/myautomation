package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TC_Car_BMW_01 {
	//@Parameters("Ad")
	@Test(groups="adhoc")
	public void BMW(@Optional("adi" )String ad) {
		System.out.println(ad);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http:www.BMW.com");
		driver.quit();

	}

}
