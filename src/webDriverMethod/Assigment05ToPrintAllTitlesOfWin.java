package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment05ToPrintAllTitlesOfWin {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sbadi/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allwindows = driver.getWindowHandles();
		for(String windowId:allwindows) {
			driver.switchTo().window(windowId);
	System.out.println(driver.getTitle());

			
		}
		

	}

}
