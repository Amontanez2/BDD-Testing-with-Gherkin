package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver driver;

    public static void iniciarDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void cerrarDriver() {
        driver.quit();
    }
}

