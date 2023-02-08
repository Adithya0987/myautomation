package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocatorRegisterPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		WebElement OpenReg = driver.findElement(By.linkText("Register"));
		OpenReg.click();
		Thread.sleep(2000);
		WebElement ClickGen = driver.findElement(By.id("gender-male"));
		ClickGen.click();
		Thread.sleep(2000);
		WebElement FristName = driver.findElement(By.id("FirstName"));
		FristName.sendKeys("Adithya");
		Thread.sleep(2000);
		WebElement LastName = driver.findElement(By.id("LastName"));
		LastName.sendKeys("SB");
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.id("Email"));
		Email.sendKeys("sbadithya4@gmail.com");
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.id("Password"));
		Password.sendKeys("Adi");
		WebElement conPassword = driver.findElement(By.id("ConfirmPassword"));
		conPassword.sendKeys("Adi");
		WebElement Regis = driver.findElement(By.id("register-button"));
		Regis.click();
	}

	
	}


