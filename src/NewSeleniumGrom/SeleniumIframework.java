package NewSeleniumGrom;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIframework {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String prant = driver.getWindowHandle();
		driver.findElement(By.xpath("//i[contains(@class,'fab fa-github')]")).click();
		
		Set<String> window = driver.getWindowHandles();
		 window.remove(prant);
		for(String var:window) {
			driver.switchTo().window(var);
		}
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.id("login_field")).sendKeys("Adithya0987",Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("Adithya0987",Keys.TAB);
	}

}
