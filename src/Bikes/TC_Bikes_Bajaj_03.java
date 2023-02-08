package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TC_Bikes_Bajaj_03 {
	//@Parameters("Name")
	@Test(groups="somke")
	public void Bajaj(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		//driver.get("http:www.Bajaj.com");
		driver.manage().window().maximize();
		//driver.quit();

		
	}
}
 