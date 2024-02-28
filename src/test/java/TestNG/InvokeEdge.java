package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerClass.class)
public class InvokeEdge {
  @Test
  public void invokeedge() {
	  
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\acer pc\\Downloads\\edgedriver_win64\\msedgedriver.exe");
      WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/");
  }
}