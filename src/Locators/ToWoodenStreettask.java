package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWoodenStreettask {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.woodenstreet.com");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@id=\"loginclose1\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(("//p[text()='Study Tables']"))).click();
		Thread.sleep(6000);
		String Number = driver.findElement(By.xpath("(//strong[contains(text(),'Rs')])[4]")).getText();
		String Number1 = Number.replace("Rs","" );
		int a=Integer.parseInt(Number);
		
		if(a<10000) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[contains(text(),' Add to Cart')]")).click();
		}
		else {
			System.out.println("its not");
			
			
		}

	
	}

	
	}


