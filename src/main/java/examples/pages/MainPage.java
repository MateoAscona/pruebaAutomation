package examples.pages;

import lombok.Data;
import org.openqa.selenium.By;

@Data

public class MainPage {

    private By btn_waffle = By.cssSelector(".slds-icon-waffle_container"); //9 puntios
    private By btn_agente = By.xpath("//p[contains(text(),'Consola de agente')]"); // consola agente
    private By btn_seleccion_secciones = By.xpath("//button[@title='Mostrar menú de navegación']"); //
//            linkText("Mostrar menú de navegación");
    private By btn_casos = By.xpath("//span[contains(text(),'Casos')]");

}
