package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment10ToCloseTheBBQ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sbadi/Downloads/MultipleWindow.html");
				 driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
				 String Child1 = "#1 buffet grill barbeque restaurant near you. Exciting Offers on lunch dinner with our trademark. | Barbeque Nation";
		 Set<String> windowsId = driver.getWindowHandles();
		 	for(String windowsId1:windowsId) {
		 		driver.switchTo().window(windowsId1);
		 		 String Macth = driver.getTitle();
		 		 if(Child1.equals(Macth)) {
		 			 driver.close();
		 		 }
		 	}
	}

}
