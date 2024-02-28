package TestNG;

import org.testng.annotations.Test;

public class PriorityTesting {
	
	@Test(priority = 0)
	

	public void testcase() {
		
		System.out.println("Testcase1 executed successfully");
		
	}
	
	@Test (priority = 2)
	public void testcase2() {
		
		System.out.print("Testcase2 executed successfully");
	}
	
	@Test(priority = 1)	
	public void testcase3() {
		
	}

}
