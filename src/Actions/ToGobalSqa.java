package Actions;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToGobalSqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		WebElement Frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(Frame);
		WebElement Intal = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement Intal1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		Thread.sleep(2000);
		WebElement Intal2 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		Thread.sleep(2000);
		WebElement Intal3 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement finala = driver.findElement(By.id("trash"));
		Actions action = new Actions(driver);
		action.dragAndDrop(Intal, finala).perform();
		Thread.sleep(2000);
		action.dragAndDrop(Intal1, finala).perform();
		Thread.sleep(1000);
		action.dragAndDrop(Intal2, finala).perform();
		//action.release(Intal2).perform();
		action.dragAndDrop(Intal3, finala).perform();
		//action.release(Intal3).perform();
		WebElement gallery = driver.findElement(By.id("gallery"));
		action.dragAndDrop(Intal1, gallery).perform();	
		action.dragAndDrop(Intal2, gallery).perform();
		driver.switchTo().parentFrame();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(416,-266);");
		driver.findElement(By.id("Accepted Elements")).click();
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class=\"demo-frame lazyloaded\"])[2]"));
		driver.switchTo().frame(frame2);
		WebElement AC = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement AC1 = driver.findElement(By.id("draggable-nonvalid"));
		WebElement droped = driver.findElement(By.id("droppable"));
		action.clickAndHold(AC1).dragAndDropBy(AC1, 98,123).perform();
		action.release();
		action.dragAndDrop(AC, droped).perform(); 
		System.out.println(droped.getText());
		
		
	}
	
}
