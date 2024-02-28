package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void testcase1() {
		
		System.out.print("Testcase1 executed successfully") ;
	}
	
	@Test(dependsOnMethods = "testcase1")
	public void testcase2() {
		
		System.out.println("Testcase2 executed successfully");
		
	}
	
	@Test
	public void testcase3() {
		
		System.out.print("Testcase3 executed successfully");
	
		
	}
}
