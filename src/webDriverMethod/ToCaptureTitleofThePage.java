package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitleofThePage {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:www.ducati.com");
		String title=driver.getTitle();
		System.out.println(title);
		String id=driver.getWindowHandle();
		System.out.println(id);

	}

}
