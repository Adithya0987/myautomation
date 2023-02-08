package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assgiment01ToGetTitleUrlSrocecode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:www.flipkart.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());

	}

}
