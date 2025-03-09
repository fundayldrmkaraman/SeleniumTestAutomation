package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("fulyaaa.fundaaa@gmail.com", "Funda111");
        Assert.assertTrue(driver.getPageSource().contains("Hesabım"));
    }
    @Test
    public void failedLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("fulyaaa.fundaaa@gmail.com", "Funda1");
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("E-posta adresiniz veya şifreniz hatalı"),
                "Hata mesajı beklenen gibi değil!");
    }
    @Test
    public void emptyFieldsShouldNotAllowLogin() {
        LoginPage loginPage = new LoginPage(driver);
        driver.findElement(By.id("Hesabım")).click();
        driver.findElement(By.id("Kayıt")).click();
        Assert.assertFalse(loginPage.isLoginButtonEnabled(),
                "Boş bilgilerle giriş yapamazsınız!");
    }
    @Test
    public void passwordCaseSensitivityTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("fulyaaa.fundaaa@gmail.com", "funda111");
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("E-posta adresiniz veya şifreniz hatalı"),
                "Girdiğiniz şifre büyük-küçük harfe duyarlı değil!");
    }
}