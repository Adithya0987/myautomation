package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandDiffBetweenCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
			driver.get("file:///C:/Users/sbadi/Downloads/MultipleWindow.html");
			driver.findElementByXPath("//input[@valve='Open Food Sites']").click();
			Thread.sleep(2000);
			Set<String> allwindowIds=driver.getWindowHandles();
			for(String WindowId:allwindowIds) {
			System.out.println(WindowId);
	}
			driver.quit();
			}

}

