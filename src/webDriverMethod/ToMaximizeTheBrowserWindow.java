package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeTheBrowserWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.ducati.com");

	}

}
