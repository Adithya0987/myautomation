package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment07TocloseParentPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sbadi/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		String expecPageTtile = "Multiple popups";
		String child1="Original Italian Recipes - Giallozafferano Recipes";
		Set<String> allwindowsId = driver.getWindowHandles();
		for(String windowsID:allwindowsId) {
			driver.switchTo().window(windowsID);
			String MainPageTtile = driver.getTitle();
			if(MainPageTtile.equals(child1)) {
				
				driver.close();
			}
			
			
			}
		}
		

	}


