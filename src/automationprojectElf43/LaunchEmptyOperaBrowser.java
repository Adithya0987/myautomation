

package automationprojectElf43;

import org.openqa.selenium.opera.OperaDriver;

public class LaunchEmptyOperaBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
		OperaDriver a= new OperaDriver();

	}

}
