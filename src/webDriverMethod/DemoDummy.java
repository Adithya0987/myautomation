package webDriverMethod;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDummy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:www.ducati.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension Size = driver.manage().window().getSize();
		System.out.println(Size.getHeight());
		System.out.println(Size.getWidth());
		Thread.sleep(2000);
		 Dimension SizeofTheSet = new Dimension(800,800);
		 driver.manage().window().setSize(SizeofTheSet);
		 Point Position =new Point(10,10);
		 driver.manage().window().setPosition(Position);
		 Point Udri = driver.manage().window().getPosition();
		 System.out.println(Udri.x);
		 System.out.println(Udri.y);
		 
		
		
		

	}

}
