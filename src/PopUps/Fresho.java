package PopUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fresho {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=CjwKCAiAkrWdBhBkEiwAZ9cdcPeLaqXPRWYYbg_eiWqa6sFC2vk-C8MkuGPnrgNbAS1vKIqxRCiPxBoCNJQQAvD_BwE&gclsrc=aw.ds");
		
		/*String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();*/
		//driver.findElement(By.xpath("//a[text()='register_Layer']")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("./AutoIT/FreshWord.exe");
		//driver.
		//driver.quit();

	}

}
