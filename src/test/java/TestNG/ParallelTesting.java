package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
    @Test
    public void invokeChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
    }

    @Test
    public void invokeEdge() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\acer pc\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/");
    }
}
