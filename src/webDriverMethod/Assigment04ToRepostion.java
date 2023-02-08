package webDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment04ToRepostion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:WWW.zomato.com");
		Point Reposi=new Point(100,50);
		driver.manage().window().setPosition(Reposi);
		System.out.println(Reposi.x);
		System.out.println(Reposi.y);
	}

}
