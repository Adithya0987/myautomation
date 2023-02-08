package JavaScrpitExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassWorks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.sparkstone.co.nz/sampleapp/101/");
		driver.findElement(By.xpath("//a[text()='Automobile']")).click();
		WebElement Make = driver.findElement(By.id("make"));
		// Make.click();
		Select s1 = new Select(Make);
		s1.selectByIndex(5);
		System.out.println(s1.isMultiple());
		List<WebElement> s2 = s1.getOptions();
		for (WebElement s3 : s2) {
			System.out.println(s3.getText());
			WebElement NumberS = driver.findElement(By.id("numberofseats"));
			Select s4 = new Select(NumberS);
			s4.selectByValue("4");

			WebElement fuel = driver.findElement(By.id("fuel"));
			Select s6 = new Select(fuel);
			s6.selectByVisibleText("Diesel");

		}
	}

}
