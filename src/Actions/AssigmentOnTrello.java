package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssigmentOnTrello {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://id.atlassian.com/");
		driver.findElement(By.id("username")).sendKeys("sbadithya4@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Adithya@13467",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Trello']")).click();
		driver.findElement(By.xpath("//div[@title='ELF42&43']")).click();
		Actions action = new Actions(driver);
		WebElement Manual = driver.findElement(By.xpath("//span[text()='Manual']"));
		WebElement Manual1 = driver.findElement(By.xpath("(//span[text()='Add a card'])[2]"));
		action.moveToElement(Manual).clickAndHold().perform();
		Thread.sleep(2000);
		action.moveByOffset(681,503).moveToElement(Manual1).perform();
		action.release().perform();
		//action.dragAndDrop(Manual, Manual1).perform();
		WebElement java = driver.findElement(By.xpath("//span[text()='JavaMock']"));
		WebElement java1 = driver.findElement(By.xpath("(//span[text()='Add a card'])[3]"));
		action.dragAndDrop(java, java1).perform();
		WebElement Selenium= driver.findElement(By.xpath("//span[text()='Selenium Mock']"));
		WebElement Selenium1 = driver.findElement(By.xpath("(//span[text()='Add a card'])[4]"));
		action.dragAndDrop(Selenium, Selenium1).perform();
	}

}
