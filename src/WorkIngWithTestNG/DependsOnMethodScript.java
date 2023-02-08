package WorkIngWithTestNG;

import org.testng.annotations.Test;

public class DependsOnMethodScript {

	@Test
	public void add() {
		System.out.println("Addtion Done");

	}
	@Test(dependsOnMethods={"add","multi"})
	public void sub() {
		int a=1/0;
		System.out.println("Sub Done");
	}
	@Test(dependsOnMethods={"div"})
	public void multi() {
		System.out.println("Muliti Done");
		
	}
	@Test(dependsOnMethods= "sub")
	public void div() {
		System.out.println("DIVISION");
	}
	
}
