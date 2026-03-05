package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/CucumberProject/Login.feature",   // 👈 your feature path
    glue = {"CucumberProject"},                      // 👈 your step definition package
    plugin = {"pretty"}
   // tags= "@test"
)
public class RunnerClass {

}
