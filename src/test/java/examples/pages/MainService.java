package examples.pages;

import examples.config.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainService {

    private MainPage mainPage;

    public MainService(){
        this.mainPage = new MainPage();
    }

    public void click_waffle(){
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.mainPage.getBtn_waffle())
        );
        DriverManager.getDriver().findElement(this.mainPage.getBtn_waffle()).click();
    }
    public void click_agente(){
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.mainPage.getBtn_agente())
        );
        DriverManager.getDriver().findElement(
                this.mainPage.getBtn_agente()).click();
    }
    public void click_secciones(){
        DriverManager.getDriver().findElement(
                this.mainPage.getBtn_seleccion_secciones()).click();
    }
    public void click_casos(){
        DriverManager.getDriver().findElement(
                this.mainPage.getBtn_casos()).click();
    }
}
