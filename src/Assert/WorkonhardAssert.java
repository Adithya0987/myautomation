package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.Assert;
public class WorkonhardAssert {
	String username="admin";
	String password="manager";
	String logintitleactual="actiTIME - Login";
	
	@Test
	public void work() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String logintitle = driver.getTitle();
		Reporter.log(logintitle,true);
		Assert.assertEquals(logintitle, logintitleactual);
		Reporter.log("Tilte macthed",true);
		driver.findElement(By.id("username")).sendKeys("admin");
		Assert.assertEquals(username, "admin");
		Reporter.log("admin entered",true);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Assert.assertEquals(password, "manager");
		driver.findElement(By.id("loginButton")).click();
		
		
	}

}
