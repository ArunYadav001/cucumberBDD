package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/login.feature",
        glue = {"stepdefinitions"}
)
public class loginRunner extends AbstractTestNGCucumberTests {


}
