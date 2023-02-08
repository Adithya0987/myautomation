package Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerfromKeysActionOn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/");
		Actions action=new Actions(driver);
		List<WebElement> driv = driver.findElements(By.id("//nav[not(@id='mobile-nav')]//div[@id=\"desktop-nav\"]//a[contains(@class,'menu')]"));
		for(WebElement driv1:driv) {
			action.keyDown(Keys.CONTROL).click(driv1).perform();
		}
		
		//action.moveByOffset(128, 153).perform();
		//action.keyDown(null, null)

	}

}
