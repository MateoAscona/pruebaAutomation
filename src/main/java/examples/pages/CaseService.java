package examples.pages;

import examples.config.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CaseService {
    private CasePage casePage;

    public CaseService(){
        this.casePage = new CasePage();
    }

    public void click_nuevoCaso(){
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.casePage.getNuevo_caso())
        );
        DriverManager.getDriver().findElement(this.casePage.getNuevo_caso()).click();
    }

    public void click_nuevoCasoFacturacion(){
        DriverManager.getLongWait().until(
                ExpectedConditions.elementToBeClickable(this.casePage.getCaso_facturacion())
        );
        DriverManager.getDriver().findElement(this.casePage.getCaso_facturacion()).click();
    }

    public void click_nuevoCasoFacturacionSiguiente(){
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.casePage.getCaso_facturacion_siguiente())
        );
        DriverManager.getDriver().findElement(this.casePage.getCaso_facturacion_siguiente()).click();
    }

    public void completar_campo_cuenta(){
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.casePage.getCampoCase())
        );
        DriverManager.getDriver().findElement(this.casePage.getCampoCase()).sendKeys("ABAD JUAN MIGUEL CABAIL");
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.casePage.getNombrePersona())
        );

        DriverManager.getDriver().findElement(this.casePage.getNombrePersona()).click();
    }

    public void select_tipo(){
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.casePage.getSelect_tipo())
        );
        DriverManager.getDriver().findElement(this.casePage.getSelect_tipo()).click();
    }

    public void select_tipoOpt(){
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.casePage.getSelect_tipoOpt())
        );
        DriverManager.getDriver().findElement(this.casePage.getSelect_tipoOpt()).click();
    }

    public void select_origen(){
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.casePage.getSelect_origen())
        );
        DriverManager.getDriver().findElement(this.casePage.getSelect_origen()).click();
    }
    public void select_origenOpt(){
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.casePage.getSelect_origenOpt())
        );
        DriverManager.getDriver().findElement(this.casePage.getSelect_origenOpt()).click();
    }
    public void click_guardar(){
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(this.casePage.getBtn_guardar())
        );
        DriverManager.getDriver().findElement(this.casePage.getBtn_guardar()).click();
    }
}
