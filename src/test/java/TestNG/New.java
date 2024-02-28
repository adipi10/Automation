package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class New {
  //Axis_TestNGG.NewTest
  @Test
  public void f() {
    System.out.println("This is my test area");
    System.setProperty("webdriver.edge.driver",
            "C:\\Users\\acer pc\\Downloads\\edgedriver_win64/msedgedriver.exe");

    
    WebDriver driver = new EdgeDriver();
    
    driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
    
    driver.manage().window().maximize();
          
          
          WebElement usernameInput = driver.findElement(By.id("text"));
          usernameInput.sendKeys("Adi");
          
      WebElement passwordInput = driver.findElement(By.id("password"));
      passwordInput.sendKeys("PASSWORD");
      
      WebElement loginButton = driver.findElement(By.id("login-button"));
      loginButton.click();
      Alert alert = driver.switchTo().alert();

        // Click the OK button on the alert
        alert.accept();

        
        // Switch back to the main window
        driver.switchTo().defaultContent();
      
  }
  @BeforeClass
  public void beforeClass() {
    System.out.println("This is my before condition area");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("This is my post condition area");
    
  }

}
