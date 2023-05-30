package examples.pages;

import lombok.Data;
import org.openqa.selenium.By;
@Data
public class CasePage {

    private By nuevo_caso = By.linkText("Nuevo");
    private By caso_facturacion = By.xpath("//span[contains(text(), 'Facturación, Deudas y Reintegros')]");
    private By caso_facturacion_siguiente = By.xpath("//span[contains(text(), 'Siguiente')]");
    private By select_tipo = By.cssSelector("#combobox-button-464");
    private By select_tipoOpt = By.xpath("//*[@id='combobox-button-464']/span");
    private By select_origen = By.xpath("//*[@id='combobox-button-473']");
    private By select_origenOpt = By.xpath("//*[@id='combobox-button-473']/span");
    private By btn_guardar = By.xpath("//button[@name='SaveEdit']");

}
