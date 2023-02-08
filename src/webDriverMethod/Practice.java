package webDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http:www.fb.com");
		String d = driver.getWindowHandle();
		System.out.println(d);
		String h = driver.getTitle();
		System.out.println(h);
			driver.close();
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe" );
			EdgeDriver driver1=new EdgeDriver();
			driver1.get("http:www.fb.com");
			driver1.manage().window().maximize();
			Dimension y = driver1.manage().window().getSize();
			System.out.println(y.getHeight());
			System.out.println(y.getWidth());
			Dimension Set=new Dimension(800,800);
			driver1.manage().window().setSize(Set);
			
			
			
			
		
		
	
		

	}

	private static void quit() {
		// TODO Auto-generated method stub
		
	}

	private static void close() {
		// TODO Auto-generated method stub
		
	}

}
