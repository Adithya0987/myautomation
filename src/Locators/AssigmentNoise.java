package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentNoise{

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gonoise.com/");
			driver.findElement(By.xpath("//div[@class=\"product-image\"]"));
			driver.findElement(By.xpath("(//img[contains(@data-sizes,\"auto\")])[9]")).click();
			Thread.sleep(4000);
			String Text = driver.findElement(By.xpath("(//h5[contains(text(),'₹')])[3]")).getText();
			System.out.println(Text);
				Text=Text.replace(",","");
				Text=Text.replace("₹", "");
				Text=Text.trim();
				int a=Integer.parseInt(Text);
				Set<String> windowsId = driver.getWindowHandles();
				for(String a1:windowsId) {
					driver.switchTo().window(a1);
				}
				if(a<5000) {
					
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[3]")).click();
					driver.findElement(By.xpath("(//button[contains(text(),'ADD to CART')])")).click();                                                   
				}
				else {
					System.out.println("Its Costly");
				}
			 	}

	
	}


