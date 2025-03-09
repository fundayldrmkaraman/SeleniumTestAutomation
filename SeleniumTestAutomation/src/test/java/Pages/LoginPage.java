package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By loginButton = By.id("Hesabım");
    private By emailField = By.id("Mailim");
    private By passwordField = By.id("Şifrem");
    private By submitButton = By.id("Kayıt");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void login(String email, String password) {
        driver.findElement(loginButton).click();
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }
    public String getErrorMessage() {
        return driver.findElement(By.className("Hata uyarısı!!!")).getText();
    }
    public boolean isLoginButtonEnabled() {
        return driver.findElement(submitButton).isEnabled();
    }
}
