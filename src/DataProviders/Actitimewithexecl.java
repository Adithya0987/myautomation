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

public class Actitimewithexecl {
	@Test(dataProvider = "data" )
	
	
	public static void  Work() throws EncryptedDocumentException, IOException{
		String[][] a= data("sheet1");
		for(String []b:a) {
			for(String c:b) {
				//System.out.println(c+"");
			}
			//System.out.println();
			
			
		}
	}
	@DataProvider
	public static String[][] data(String SheetName) throws EncryptedDocumentException, IOException{
		FileInputStream fis= new FileInputStream(new File("./TestData/actitime.xlsx"));
		Workbook Workbook = WorkbookFactory.create(fis);
		Sheet sheet = Workbook.getSheet(SheetName);
		int row=sheet.getPhysicalNumberOfRows()-1;
		int colu=sheet.getRow(0).getPhysicalNumberOfCells(); 
		
		String[][]arr=new String[row][colu];
		for(int i=0;i<row;i++) {
			for(int j=0;j<colu;j++) {
				arr[i][j]= sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return arr;
		
	}
		
		
	@Test(dataProvider="work")
	public void test (String[]url) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url[0]);
		driver.findElement(By.id("username")).sendKeys(url[1]);
		driver.findElement(By.name("pwd")).sendKeys(url[2]);
		driver.findElement(By.partialLinkText("Login")).click();
		
	}

}
