package Tests;

import Pages.HomePage;
import Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingTest {
    @Test
    public void sortByPriceTest() {
        WebDriver driver = null;
        HomePage homePage = new HomePage(driver);
        homePage.search("asus rog strix g16");
        ProductPage productPage = new ProductPage(driver);
        productPage.sortByLowestPrice();
        Assert.assertTrue(driver.getPageSource().contains("En düşük fiyat"),
                "Fiyat sıralaması doğru çalışmıyor!");
    }
}
