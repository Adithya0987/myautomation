package DataProviders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Scrpit1 {
	@DataProvider
	public String[][] data(){
		String arr[][]= {{"admin","manager"},{"trainee","trainee"}};
		return arr;
		
	}
	
	@Test(dataProvider="data")
	public void test (String[]url) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(url[0]);
		driver.findElement(By.name("pwd")).sendKeys(url[1]);
		driver.findElement(By.partialLinkText("Login ")).click();
		
		
	}
	

}
