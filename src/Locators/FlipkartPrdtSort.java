package Locators;



	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.TreeSet;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FlipkartPrdtSort {
		public static int countOfProductAdded = 0;
		public static ChromeDriver driver;

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(1000);
			String productName="lakme lipstick";
			searchAndAddToCartTheProduct(productName);
			searchAndAddToCartTheProduct("Maybelline lipstick");
		searchAndAddToCartTheProduct("Sugar lipstick");
			 removeLowestProductFromCart();
		}

		public static void searchAndAddToCartTheProduct(String productName) throws InterruptedException{
			System.out.println(productName);
			countOfProductAdded++;
			driver.findElement(By.name("q")).click();
			driver.findElement(By.name("q")).sendKeys(productName, Keys.ENTER);

			driver.findElement(By.xpath("(//div[contains(text(),'₹')]/..)[2]")).click();
			String parentWindowId = driver.getWindowHandle();
			Set<String> allWindowIds = driver.getWindowHandles();
			allWindowIds.remove(parentWindowId);
			for (String windowId : allWindowIds) {
				driver.switchTo().window(windowId);
			}
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			driver.close();
			driver.switchTo().window(parentWindowId);
			driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "a");
			driver.findElement(By.name("q")).sendKeys(Keys.DELETE);
		}

		public static void removeLowestProductFromCart()throws InterruptedException {
			driver.findElement(By.xpath("//span[text()='Cart']")).click();
			int lowestCost = 0;
			List<Integer> costIndex = new ArrayList<>();
			Set<Integer> costSort = new TreeSet<>();
			for (int i = 1; i <= countOfProductAdded; i++) {
				String costOfProduct = driver.findElement(By.xpath("//div[contains(text(),'₹')]")).getText();
				costOfProduct = costOfProduct.trim();
				costOfProduct = costOfProduct.replace("", "");
				int productPrice = Integer.parseInt(costOfProduct);
				costIndex.add(productPrice);
				costSort.add(productPrice);
			}
			for (Integer cost1 : costSort) {
				lowestCost = cost1;
				break;
			}
			System.out.println("the lowest cost: " + lowestCost);
			int indexOfProductRemoved = costIndex.indexOf(lowestCost);
			indexOfProductRemoved += 1;
			driver.findElement(By.xpath("(//div[text()='Remove'])[" + indexOfProductRemoved + "]")).click();
		}

		

	}


