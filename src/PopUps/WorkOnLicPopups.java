package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkOnLicPopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		//Set<String> windowsId = driver.getWindowHandles();
		//WebElement click1 = driver.findElement(By.xpath("//a[@title='Agents Portal']"));
		Actions action = new Actions(driver);
		 //Set<String> dd = driver.getWindowHandles();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700);");
		try {
		driver.findElement(By.xpath("//a[@title='Agents Portal']")).click();
		}catch(Exception e){
			js.executeScript("window.scrollBy(0,700);");
		driver.findElement(By.xpath("//a[@title='Agents Portal']")).click();
		}
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Set<String> partent = driver.getWindowHandles();
		String ChildId=driver.getWindowHandle();
		partent.remove(ChildId);
				for( String wind:partent) {
			driver.switchTo().window(wind);
				}
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		}
		
		
		
}
