package DataDrivers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertiesFiles {

	public static void main(String[] args) throws IOException {
		File abspath= new File("./TestData/Test.properties");
		FileInputStream  work = new  FileInputStream(abspath);
		Properties pro= new Properties();
		pro.load(work);
		String Keyf = pro.getProperty("Key");
		 String Pathof = pro.getProperty("path");
		 String UrlOF = pro.getProperty("url");
		 
		 System.setProperty(Keyf, Pathof);
		 WebDriver driver = new ChromeDriver();
		 driver.get(UrlOF);
	}

}
