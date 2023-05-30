package examples.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/CrearNuevoCaso.feature"},
        glue = {"org.example.definicionpasos"}
)

public class RunCrearCasoSteps extends AbstractTestNGCucumberTests {
}
