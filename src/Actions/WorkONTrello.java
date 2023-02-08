package Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkONTrello {

	public static void main(String[] args) {
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
		WebElement context = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		Actions action = new Actions(driver);
		action.contextClick(context).perform();
		List<WebElement> textArea = driver.findElements(By.xpath("//div[@class=\"quick-card-editor-buttons fade-in\"]"));
		for(WebElement menu : textArea) {
			System.out.println(menu.getText());
		}
	}

}
