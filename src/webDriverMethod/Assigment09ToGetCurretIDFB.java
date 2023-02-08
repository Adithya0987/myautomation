package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment09ToGetCurretIDFB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:www.fb.com");
		System.out.println(driver.getWindowHandle());

	}

}
