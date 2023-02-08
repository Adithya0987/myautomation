package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment08ToclosealltheChildWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sbadi/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		String expecPageTtile = "Multiple popups";
		
		Set<String> allwindowsId = driver.getWindowHandles();
		for(String windowsID:allwindowsId) {
			driver.switchTo().window(windowsID);
			Thread.sleep(2000);
			String MainPageTtile = driver.getTitle();
			if(!MainPageTtile.equals(expecPageTtile)) {
				
				driver.close();
			}
		}
	}
}
	


