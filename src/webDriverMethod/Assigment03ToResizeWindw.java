package webDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment03ToResizeWindw {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:www.Zomato.com");
		driver.manage().window().maximize();
		Dimension Resize= new Dimension(200,100);
		driver.manage().window().setSize(Resize);
		Resize=driver.manage().window().getSize();
		System.out.println(Resize.getHeight());
		System.out.println(Resize.getWidth());
	}

	
	}


