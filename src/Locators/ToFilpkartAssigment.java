package Locators;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToFilpkartAssigment {


	
		public static WebDriver driver;
		public static void searchClick(String product1,String index) throws InterruptedException {
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(product1,Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@target='_blank']["+index+"]")).click();
			Set<String> ids = driver.getWindowHandles();
			for(String i : ids) {
				driver.switchTo().window(i);
			}
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			Thread.sleep(3000);
		}
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			String parentWindowId = driver.getWindowHandle();
			searchClick("lipbalm","3");
			searchClick("lipstick","3");
			searchClick("kajal", "3");
			String costOfProduct1 = driver.findElement(By.xpath("(//span[contains(text(),'₹')])[2]")).getText();
			String costOfProduct2 = driver.findElement(By.xpath("(//span[contains(text(),'₹')])[4]")).getText();
			String costOfProduct3 = driver.findElement(By.xpath("(//span[contains(text(),'₹')])[6]")).getText();
			TreeSet t1 = new TreeSet();
			t1.add(costOfProduct1);
			t1.add(costOfProduct2);
			t1.add(costOfProduct3);
			System.out.println(t1);
			ArrayList a1 = new ArrayList<>(t1);
			Object cheapestPrice = a1.get(0);
			System.out.println(cheapestPrice);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if(costOfProduct1.equals(cheapestPrice)) {
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
			else if(costOfProduct2.equals(cheapestPrice)) {
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
			}else if(costOfProduct3.equals(cheapestPrice)) {
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


