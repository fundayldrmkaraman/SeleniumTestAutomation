package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    private By registerButton = By.id("Kayıt");
    private By nameField = By.id("Ad");
    private By emailField = By.id("Email");
    private By passwordField = By.id("Sifre");
    private By confirmPasswordField = By.id("Sifre Onay");
    private By submitButton = By.id("Onayla");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void register(String name, String email, String password) {
        driver.findElement(registerButton).click();
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }
}