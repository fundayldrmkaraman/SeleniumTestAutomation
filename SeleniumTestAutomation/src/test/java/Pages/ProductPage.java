package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By sortByPrice = By.xpath("//select[@id='sorting']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public void sortByLowestPrice() {
        driver.findElement(sortByPrice).sendKeys("En düşük fiyat");
    }
}