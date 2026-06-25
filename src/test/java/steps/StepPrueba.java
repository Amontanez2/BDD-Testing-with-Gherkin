package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class StepPrueba {

    @Given("prueba selenium")
    public void prueba_selenium() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
