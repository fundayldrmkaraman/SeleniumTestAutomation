package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    public void successfulRegistrationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register("Yeni Kayıt", "fundayildirimkaaraman@otlook.com", "Fndyk111");
        Assert.assertTrue(driver.getPageSource().contains("Kayıt işlemi başarılı"),
                "Kayıt başarılı olmadı!");
    }
}
