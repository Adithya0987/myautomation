package DataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProdivedForDemo {
	@DataProvider(parallel=true)
	public String[][] demo() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(new File("./TestData/DemoData.xlsx"));
		  Workbook Workbook = WorkbookFactory.create(fis);
		  Sheet datasheet = Workbook.getSheet("Sheet1");
		  int row=datasheet.getPhysicalNumberOfRows()-1;
		  int colu=datasheet.getRow(0).getPhysicalNumberOfCells();
		  String[][]arr=new String[row][colu];
		  for(int i=1,h=0;i<=row;i++,h++) {
			  for(int j=0;j<colu;j++) {
				  arr[h][j]=datasheet.getRow(i).getCell(j).toString();
			  }
		  }
				  return arr;
	}
			@Test(dataProvider="demo",invocationCount=10)
			public void demo1(String[]data) {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				driver.get("https://demowebshop.tricentis.com/register");
				driver.findElement(By.id("gender-"+data[0]+"")).click();
				driver.findElement(By.id("FirstName")).sendKeys(data[1]);
				driver.findElement(By.id("LastName")).sendKeys(data[2]);
				driver.findElement(By.id("Email")).sendKeys(data[3]);
				driver.findElement(By.id("Password")).sendKeys(data[4]);
				driver.findElement(By.id("ConfirmPassword")).sendKeys(data[5]);
				driver.findElement(By.id("register-button")).click();
				driver.quit();
			}
}