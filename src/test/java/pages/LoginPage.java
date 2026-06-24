package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usuario = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public void abrirPagina() {
        driver.get("https://www.saucedemo.com");
    }

    public void ingresarUsuario(String user) {
        driver.findElement(usuario).sendKeys(user);
    }

    public void ingresarPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}