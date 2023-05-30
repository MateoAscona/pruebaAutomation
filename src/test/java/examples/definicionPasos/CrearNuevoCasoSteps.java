package examples.definicionPasos;

import com.fasterxml.jackson.databind.node.DecimalNode;
import examples.config.DriverManager;
import examples.pages.CasePage;
import examples.pages.CaseService;
import examples.pages.LoginService;
import examples.pages.MainService;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CrearNuevoCasoSteps {

    LoginService loginService;
    MainService mainService;
    CaseService caseService;
    CasePage casePage;

    @Before
    public void setup(){
        DriverManager.create("chrome");
        DriverManager.getDriver().get("https://sancorsalud--uatqa.sandbox.my.salesforce.com");
        loginService = new LoginService();
        mainService = new MainService();
        caseService = new CaseService();
        casePage = new CasePage();
    }

    @Given("El oficial esta logueado")
    public void oficialDaDeAltaUnNuevoCasoTipoFacturación() {

        loginService.iniciar_sesion("manuel.chavez@sancorsalud.com.ar.uatqa", "Manuel2311");
    }

    @When("Se crea un nuevo caso tipo facturacion")
    public void sePreguntaAsociadoSolicitaQueLeEnviemosAlgunaDeSusFacturasPresentandoLasOpcionesSIONO() throws InterruptedException {
        mainService.click_waffle();
        mainService.click_agente();
        mainService.click_secciones();
        Thread.sleep(5000);
        mainService.click_casos();
        caseService.click_nuevoCaso();
        caseService.click_nuevoCasoFacturacion();
        caseService.click_nuevoCasoFacturacionSiguiente();
        caseService.select_tipo();
        caseService.select_origen();
        caseService.completar_campo_cuenta();
    }

    @Then("se espera la respuesta del asistente")
    public void seEsperaLaRespuestaDelAsistente() {
        DriverManager.getLongWait().until(
                ExpectedConditions.visibilityOfElementLocated(this.casePage.getMsjAsistente())
        );
        var msj = DriverManager.getDriver().findElement(this.casePage.getMsjAsistente()).getText();

        Assert.assertEquals(msj, "¿Asociado/a solicita que le enviemos algunas de sus facturas?", "Comprobando mensaje");
    }
}
