package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssigmentOnWoodStreet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http:www.woodenstreet.com");
		driver.findElement(By.xpath("//div[@id=\"loginclose1\"]")).click();
		WebElement dining = driver.findElement(By.xpath("//a[text()='Dining']"));
		Actions action = new Actions(driver);
		action.moveByOffset(414, 159).perform();
		WebElement dining1 = driver.findElement(By.xpath("//a[text()='8 Seater Dining Sets ']"));
		action.moveToElement(dining1).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 String Amount = driver.findElement(By.xpath("(//strong[contains(text(),'Rs')])[4]")).getText();
		 js.executeScript("arguments[0].scrollIntoView(true)",Amount);
		 		Amount=Amount.replace("Rs", "");
		 		Amount=Amount.replace(",","");
		 		Amount=Amount.trim();
		 	 	int a=Integer.parseInt(Amount);
		 		if(a<100000) { 
		 			   driver.findElement(By.partialLinkText("Add to Cart"));
		 					
		 		}
		 		else {
		 			System.out.println("Its Too Cost");
		 		}
		 		
		 			
		 			
		 		}
		
	}


