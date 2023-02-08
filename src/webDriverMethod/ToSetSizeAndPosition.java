package webDriverMethod;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;



public class ToSetSizeAndPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.ducati.com");
		Dimension sizeofTheBrowser= driver.manage().window().getSize();
		int height=sizeofTheBrowser.getHeight();
		int width=sizeofTheBrowser.getWidth();
		System.out.println(height);
		System.out.println(width);
		
		/*Point positionOfTheBrowser = driver.manage().window().getPosition();
		System.out.println(positionOfTheBrowser.x);
		System.out.println(positionOfTheBrowser.y);*/
		Dimension SetoftheSize=new Dimension(800,800);
		driver.manage().window().setSize(SetoftheSize);
		Point SetofthePosistion =new Point(11,11);
		driver.manage().window().setPosition(SetofthePosistion);
	}

}
