package PopUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMakeMyTripAssigment {

	public static void main(String[] args) {
		LocalDateTime TodaysDate=LocalDateTime.now().plusHours(48);
		//System.out.println(TodaysDate);
		String month = TodaysDate.getMonth().name();
		//System.out.println(month);
		int year = TodaysDate.getYear();
		//System.out.print(year);
		int TodayDate = TodaysDate.getDayOfMonth();
		//System.out.println(TodayDate);
		String sub = month.substring(1,month.length());
		//System.out.println(sub);
		String sub1 = sub.toLowerCase();
		String Lower = month.charAt(0)+""+sub1;
		System.out.println(Lower);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Actions action=new Actions(driver);
		action.click().perform();
	    //driver.findElement(By.xpath("//p[contains(text(),'Login/Signup for Best Prices')]")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		//for(;;) {
			//try {
				driver.findElement(By.xpath("//div[text()='"+Lower+" "+year+"']/../..//p[text()='"+TodayDate+"']")).click();
			}//catch(Exception e) {
		
		//driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			//}
	//}

	}
//}
