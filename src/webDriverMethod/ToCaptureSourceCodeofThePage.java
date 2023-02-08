package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCodeofThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:www.ducati.com");
		String sourceofcode =driver.getPageSource();
		System.out.println(sourceofcode);
		

	}

}
