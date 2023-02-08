package Assert;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkonTBcolours {
	String Expted="Enter Vehicle Data";
	
	 
	@Test
	public void ep() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		WebElement titile = driver.findElement(By.id("nav_camper"));
		titile.click();
		String actual = driver.getTitle();
		Reporter.log(actual,true);
		Assert.assertEquals(actual, Expted,"Its working proper");
		WebElement cler = driver.findElement(By.id("engineperformance"));
		cler.sendKeys("500");
		cler.clear();
		Assert.assertEquals(cler.getCssValue("border-color"),"rgb(204, 28, 13)","no");
		Reporter.log("border-color is As per requriment ",true);
		driver.quit();
		
	}

}
