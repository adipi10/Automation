package TestNG;

import org.testng.annotations.Test;

public class EnableFalse {
	
	
	@Test(enabled = false)
	public void testcase1() {
		
		
		System.out.println("Testcase1 executed successfully");
	}
	
	
	@Test
	public void testcase2() {
		
		
		System.out.println("Testcase2 executed successfully");
	}
	
	
	@Test(priority = 0)
	public void testcase3() {
	
	
	System.out.println("Testcase3 executed successfully");
}

}
