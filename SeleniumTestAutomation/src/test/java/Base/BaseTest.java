package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://giris.hepsiburada.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
