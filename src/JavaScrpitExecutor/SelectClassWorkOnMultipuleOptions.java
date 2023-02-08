package JavaScrpitExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassWorkOnMultipuleOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("file:///C:/Users/sbadi/Downloads/dropDown.html");
		 WebElement demo = driver.findElement(By.id("s1"));
		 Select s1= new Select(demo);
		 s1.selectByIndex(0);
	}

}
