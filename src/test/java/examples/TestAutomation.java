package examples;

import examples.config.DriverManager;
import examples.pages.CaseService;
import examples.pages.LoginService;
import examples.pages.MainService;


public class TestAutomation {
    public static void main(String[] args) throws InterruptedException {

        // Inicialización del WebDriver
        DriverManager.create("Chrome");

        DriverManager.getDriver().get("https://sancorsalud--uatqa.sandbox.my.salesforce.com"
                );


        LoginService loginService = new LoginService();
        MainService mainService = new MainService();
        CaseService caseService = new CaseService();

        loginService.iniciar_sesion("mateo.ascona@sancorsalud.com.ar.uatqa", "Mate24695");



        mainService.click_waffle();
        mainService.click_agente();
        Thread.sleep(5000);
        mainService.click_secciones();
        mainService.click_casos();

        caseService.click_nuevoCaso();
        caseService.click_nuevoCasoFacturacion();
        caseService.click_nuevoCasoFacturacionSiguiente();
        caseService.select_tipo();
        caseService.select_tipoOpt();
        caseService.select_origen();
        caseService.select_origenOpt();

        caseService.click_guardar();




              // Pasos
        /*WebElement oficial = driver.findElement(By.id("oficial"));
        oficial.click();

        WebElement nuevoCaso = driver.findElement(By.id("nuevoCaso"));
        nuevoCaso.click();

        WebElement tipoFacturacion = driver.findElement(By.id("tipoFacturacion"));
        tipoFacturacion.click();

        // Resultado Esperado
        WebElement preguntaEnvioFacturas = driver.findElement(By.id("preguntaEnvioFacturas"));
        String pregunta = preguntaEnvioFacturas.getText();
        System.out.println("Pregunta: " + pregunta);

         */

        // Cerrar el navegador
        //driver.quit();

        Thread.sleep(10000);
    }
}
