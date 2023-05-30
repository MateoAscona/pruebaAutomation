package examples.pages;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class CasePage {

    private By nuevo_caso = By.linkText("Nuevo");
    private By caso_facturacion = By.xpath("//span[contains(text(), 'Facturación, Deudas y Reintegros')]");
    private By caso_facturacion_siguiente = By.xpath("//span[contains(text(), 'Siguiente')]");
    private By select_tipo = By.xpath("//button[@aria-label='Tipo, --Ninguno--']");
    private By select_tipoOpt = By.xpath("//span[@title='Campaña Compartí Salud']");
    private By select_origen = By.xpath("//button[@aria-label='Origen del caso, --Ninguno--']");
    private By select_origenOpt = By.xpath("//span[@title='Digital']");
    private By btn_guardar = By.xpath("//button[@name='SaveEdit']");

}
