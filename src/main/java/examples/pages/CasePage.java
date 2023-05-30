package examples.pages;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class CasePage {

    private By nuevo_caso = By.linkText("Nuevo");
    private By caso_facturacion = By.xpath("//span[contains(text(), 'Facturación, Deudas y Reintegros')]");
    private By caso_facturacion_siguiente = By.xpath("//span[contains(text(), 'Siguiente')]");

    private By campoCase = By.xpath("//input[@placeholder='Buscar Cuentas...']");
    private By select_tipo = By.xpath("//button[@aria-label='Tipo, --Ninguno--']");
    private By select_tipoOpt = By.xpath("//span[@title='Facturación/Deuda']");
    private By select_origen = By.xpath("//button[@aria-label='Origen del caso, --Ninguno--']");
    private By select_origenOpt = By.xpath("//span[@title='Digital']");
    private By btn_guardar = By.xpath("//button[@name='SaveEdit']");

    private By msjAsistente = By.xpath("//p/b[contains(text(), '¿Asociado/a solicita que le enviemos algunas de sus facturas?')]");
    private By nombrePersona = By.xpath("//lightning-base-combobox-formatted-text[@title='ABAD JUAN MIGUEL CABAIL']");
}
