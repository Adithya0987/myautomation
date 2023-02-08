package Locators;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkOnFlipkartAssigment {

	private static final boolean String = false;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		String windowFIX = (driver.getWindowHandle());
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("vivo mobiles",Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//a[contains(@rel,'noopener noreferrer')])[1]")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		for(String a1:windowId) {
			driver.switchTo().window(a1);
		}
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Set<String> windowsId1 = driver.getWindowHandles();
		for(String a2:windowsId1){
				driver.switchTo().window(a2);
				}
		 
			driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).clear();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("realme mobiles",Keys.ENTER);
			Thread.sleep(8000);				
			driver.findElement(By.xpath("(//a[contains(@rel,'noopener noreferrer')][1])")).click();
			Thread.sleep(5000);
			Set<java.lang.String> wind1 = driver.getWindowHandles();
			for(String a3:wind1) {
				driver.switchTo().window(a3);
				}
			Thread.sleep(10000);
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).clear();
			driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("oppo mobile",Keys.ENTER);
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//a[contains(@rel,\"noopener noreferrer\")])[2]")).click();
			Thread.sleep(6000);
			Set<java.lang.String> windo2 = driver.getWindowHandles();
			for(String a4:windo2) {
				driver.switchTo().window(a4);
			}
			Thread.sleep(10000);
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
				Thread.sleep(6000);
				
Thread.sleep(6000);
			java.lang.String mi = driver.findElement(By.xpath("(//span[text()='₹'])[2]")).getText();
			java.lang.String realme = driver.findElement(By.xpath("(//span[text()='₹'])[4]")).getText();
			java.lang.String vivo = driver.findElement(By.xpath("(//span[text()='₹'])[6]")).getText();
			/*System.out.println(mi);
			System.out.println(realme);
			System.out.println(vivo);*/
			TreeSet  ts= new TreeSet();
			ts.add(realme);
			ts.add(vivo);
			ts.add(mi);
			ArrayList a1 = new ArrayList<>(ts);
			Object cheapestPrice = a1.get(0);
			System.out.println(cheapestPrice);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if(mi.equals(cheapestPrice)) {
				for(;;) {
					try {
						driver.findElement(By.xpath("(//span[contains(text(),'₹')])[2]/../../..//div[text()='Remove']")).click();
						driver.findElement(By.xpath("//div[text()='Remove']")).click();
						break;
					}
					catch(Exception e){
						js.executeScript("window.scrollBy(0,50);");
					}
				}
			}
			else if(realme.equals(cheapestPrice)) {
				for(;;) {
					try {
						driver.findElement(By.xpath("(//span[contains(text(),'₹')])[4]/../../..//div[text()='Remove']")).click();
						driver.findElement(By.xpath("//div[text()='Remove']")).click();
						break;
					}
					catch(Exception e){
						js.executeScript("window.scrollBy(0,50);");
					}
				}
			}else if(vivo.equals(cheapestPrice)) {
				for(;;) {
					try {
						driver.findElement(By.xpath("(//span[contains(text(),'₹')])[6]/../../..//div[text()='Remove']")).click();
						driver.findElement(By.xpath("//div[text()='Remove']")).click();
						break;
					}
					catch(Exception e){
						js.executeScript("window.scrollBy(0,50);");
					}
						}
	
		
	}
}
}
