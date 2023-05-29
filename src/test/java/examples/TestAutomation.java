package examples;

import examples.config.DriverManager;
import examples.pages.LoginService;
import examples.pages.MainService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {
    public static void main(String[] args) throws InterruptedException {

        // Inicialización del WebDriver
        DriverManager.create("Chrome");

        // Escenario 1: Validar que se pregunte si el asociado solicita el envío de facturas al dar de alta un nuevo caso Tipo Facturación
        DriverManager.getDriver().get("https://sancorsalud--uatqa.sandbox.my.salesforce.com"
                );


        LoginService loginService = new LoginService();
        MainService mainService = new MainService();

        loginService.iniciar_sesion("mateo.ascona@sancorsalud.com.ar.uatqa", "Mate24695");



        mainService.click_waffle();
        mainService.click_agente();
        mainService.click_secciones();
        mainService.click_casos();
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
