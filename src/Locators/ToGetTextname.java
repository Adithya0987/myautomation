package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTextname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:www.abhibus.com");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//label[@for=\"input\"]")).getText();
		System.out.println(text);
		

	}

}
