package TestNG;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerClass.class)
public class InvokeChromeBroswer {
  @Test
  public void invokechrome() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
  }
}
