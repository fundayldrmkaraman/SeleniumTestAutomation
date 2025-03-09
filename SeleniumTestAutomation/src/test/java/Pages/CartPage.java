package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;
    private By addToCartButton = By.id("Sepete Ekle");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}