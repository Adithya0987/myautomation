package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentForLoginPage {

	public static void main(String[] args) throws InterruptedException {
		String ExpectedLoginPageTitle="Demo Web Shop";
		String ExpectedHomePage="";
		String UserNameData = "sbadithya4@gmail.com";
			String PasswordData = "Adithya@1";
		//Step 1:Open browser and enter the test Url
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println("Empty Chrome browser is opened");
		driver.manage().window().maximize();
		System.out.println("Browser window is maximize");
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String Title = driver.getTitle();
		if(ExpectedLoginPageTitle.equals(Title)) {
			System.out.println("Login Page Is Displayed");
		}
		else {
			System.out.println("Login Page Is Not Displayed");
		}
		
		//Step2 Enter Valid  User name Credentials
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		WebElement UserTextField=driver.findElement(By.id("Email"));
        UserTextField.sendKeys(UserNameData);
        String actualUserData = UserTextField.getAttribute("value");
        if(UserNameData.equals(actualUserData)) {
        	System.out.println("User Name Data Entered ");
        }
        else {
        	System.out.println("User Name Data Not Entered ");
        }
        //Step3 Enter Valid Password 
       WebElement PasswordTextField = driver.findElement(By.id("Password"));
       PasswordTextField.clear();
        PasswordTextField.sendKeys(PasswordData);
        String actualpasswordData = PasswordTextField.getAttribute("value");
        if(PasswordData.equals(actualpasswordData)) {
        	System.out.println("Password Data Is Entered");
        	
        }
        else {
        	System.out.println("Password Data Is Not Entered");
        }
        
        //Step4 Click on Login Button
        driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
        String windowsText = driver.getTitle();
        if(!ExpectedLoginPageTitle.equals(windowsText)) {
        	System.out.println("Home Page Is Displyed");
        }
        else {
        	System.out.println("Home Page Is Not Displyed");
        }
		Thread.sleep(2000);
		driver.quit();
	}

}
