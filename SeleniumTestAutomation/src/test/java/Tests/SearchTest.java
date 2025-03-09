package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;

public class SearchTest extends BaseTest {

    @Test
    public void searchProductTest() {
        HomePage homePage = new HomePage(driver);
        homePage.search("asus rog strix g16");
        Assert.assertTrue(driver.getPageSource().contains("asus rog strix g16"),
                "Aranan ürün listelenmedi!");
    }
}