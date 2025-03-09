package Tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @Test
    public void addToCartTest() {
        WebDriver driver = null;
        HomePage homePage = new HomePage(driver);
        homePage.search("asus rog strix g16");
        CartPage cartPage = new CartPage(driver);
        cartPage.addToCart();
        Assert.assertTrue(driver.getPageSource().contains("Sepetinizde 1 ürün var"),
                "Ürün sepete eklenmedi!");
    }
}
