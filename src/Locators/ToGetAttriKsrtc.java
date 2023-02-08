package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAttriKsrtc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/#");
		String cancel = driver.findElement(By.xpath("//a[@title=\"Cancel Tickets\"]")).getAttribute("title");
		System.out.println(cancel);
		

	}

}
