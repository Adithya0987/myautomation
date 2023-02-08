package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeOfFace {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.fb.com");
		Dimension size = driver.findElement(By.id("email")).getSize();
		System.out.println(size.width);
		Dimension sizePass = driver.findElement(By.xpath("//input[@id=\"pass\"]/..")).getSize();
		System.out.println(sizePass.width);
		//sizeheigth=driver.findElement(By.xpath(null))
		 Point Loc1 = driver.findElement(By.id("email")).getLocation();
		System.out.println(Loc1.x);
		Point LocPass = driver.findElement(By.id("pass")).getLocation();
		System.out.println(LocPass.x);
		int xuserSizepluslocation = size.width+Loc1.x;
		
		int xpassSizepluslocation=sizePass.width+LocPass.x;
		//left allimengat
		if(size.equals(sizePass)) {
			System.out.println("its alinment");
		}
		else {
			System.out.println("its not alinmengt");
		}
		if(xuserSizepluslocation==xpassSizepluslocation) {
			System.out.println("its  a good ");
		}
			else {
				System.out.println("its not a good ");
			}

			}
		
	}


