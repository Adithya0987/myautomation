package WorkIngWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationWork {           //Tc WebTest_001;

	@Test(priority=1 )
	public void Ducati(){    //Tc;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.Ducati.com");
		Reporter.log("Opening Ducati");
		driver.quit();

	}
	@Test(priority=0)
	public void lambrogini(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.Lambrogini.com");
		Reporter.log("Opening Lambrogini");
		driver.quit();
	}
	@Test(priority=-2)
	public void AM(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.Astomartin.com");
		Reporter.log("Opeing BMW");
		driver.quit();

	}

}
