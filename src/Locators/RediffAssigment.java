package Locators;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class RediffAssigment {

	private static final TakesScreenshot TakesScreenshot = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();

		driver.findElement(By.xpath("//input[@name=\"login\"]")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Testing@123", Keys.ENTER);

		driver.findElement(By.xpath("//b[text()='Write mail']")).click();

		WebElement name = driver.findElement(By.id("TO_IDcmp2"));
		name.sendKeys("sumanthElfBatch@rediffmail.com", Keys.ENTER);
		driver.findElement(By.xpath("//input[@class=\"rd_inp_sub rd_subject_datacmp2\"]")).sendKeys("Adithya",Keys.ENTER);
		WebElement swiththecontrol = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(swiththecontrol);
		driver.findElement(By.xpath("//body[contains(@class,'cke_editable')]")).sendKeys("Good Eveing");
		//driver.findElement(By.xpath("//button[@title='close']")).click();
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("//a[@class='send_ng_compo rd_btn_cmp_send']")).click();
		//driver.findElement(By.xpath("//button[@title='close']")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Inbox']")).click();
		driver.findElement(By.xpath("//cite[@title=\"Refresh Inbox\"]")).click();
		
		driver.findElement(By.xpath("//span[@title=\"Adithya\"]/..//cite[@title=\"Select mail\"]")).click();
		
		driver.findElement(By.xpath("//span[@class='rd_mail_opt']")).click();
		
		//Take Screen Shot
		
		File tc = driver.findElement(By.xpath("//div[@id='rdNotify']")).getScreenshotAs(OutputType.FILE);
		 File tc1 = new File("./ErrorPic/snap6.png");
		 FileHandler.copy(tc, tc1);
	}

}
