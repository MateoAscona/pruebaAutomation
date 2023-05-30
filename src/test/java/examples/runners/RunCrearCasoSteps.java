package examples.runners;

import examples.config.DriverManager;
import examples.pages.CasePage;
import examples.pages.CaseService;
import examples.pages.LoginService;
import examples.pages.MainService;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.Assert;

@CucumberOptions(
        features = {"src/test/resources/features/CrearNuevoCaso.feature"},
        glue = {"org.example.definicionPasos"}
)

public class RunCrearCasoSteps extends AbstractTestNGCucumberTests {
}
