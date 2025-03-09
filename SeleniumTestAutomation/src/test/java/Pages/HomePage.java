package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By searchBox = By.className("Arama Cubugu");
    private By searchButton = By.className("Arama Butonu");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void search(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
        driver.findElement(searchButton).click();
    }
}