package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Bikes_ducati_01 {
	//@Parameters("Ducati")
	@Test(groups="Integration")
	public void DucatiMos() {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		//driver.get("http:www.duacti.com");
		driver.quit();
	}
}
