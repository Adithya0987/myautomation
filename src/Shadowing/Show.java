package Shadowing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Show {
	 public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.id("shadow_host"));
		SearchContext shadowroot= expandshadowRoot(shadowHost);
		System.out.println(shadowroot.findElement(By.cssSelector("span[id='shadow_content']>span")).getText());
		
	}
	public static SearchContext expandshadowRoot(WebElement shadowHost) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		SearchContext shadowroot= (SearchContext)js.executeScript("return.arguments[0].shawdowRoot,shadowHost",shadowHost);
		return shadowroot;
		
	}

}
