package CrossBrowseing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowschrome {
     	@Parameters({"url","Browser"})
		@Test()
		public void DucatiMos(@Optional("http:www.duacti.com") String s,
				@Optional("Chrome")String Bname ){
			WebDriver driver= null;
			if(Bname.equalsIgnoreCase("Chrome")) {
				driver= new ChromeDriver();
			}
			else if(Bname.equalsIgnoreCase("Firefox")) {
				//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				driver= new FirefoxDriver();
			}
			else {
				System.out.println("hi");
			}
			

	}


}

