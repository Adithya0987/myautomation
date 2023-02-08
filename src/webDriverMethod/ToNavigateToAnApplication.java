package webDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToNavigateToAnApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		ChromeDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.get("http:www.Ranjitha.com");
		a.get("https:www.fb.com");
		a.navigate().back();
		//Dimension set = new Dimension(100,200);
		//a.manage().window().setSize(set);
		//System.out.println(a.manage().window().getSize());
		Point set1= new Point(500,300);
		a.manage().window().setPosition(set1);
		Thread.sleep(2000);
		a.quit();
		
				
		
		
	}

}
