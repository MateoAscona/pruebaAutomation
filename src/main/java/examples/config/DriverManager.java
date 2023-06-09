package examples.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static WebDriverWait longWait;

    public static void create(String browser) {
        // Creamos el driver con el browser deseado
        driver = WebDriverManager.getInstance(browser).create();
        driver.manage().window().maximize();
        longWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public static WebDriverWait getLongWait() {
        return longWait;
    }

    public static void ingresarTexto(WebElement elemento, String texto) {
        elemento.sendKeys(texto);
    }

}

