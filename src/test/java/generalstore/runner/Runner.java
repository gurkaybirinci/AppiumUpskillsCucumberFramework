package generalstore.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:raporlar/CucumberRapor.html",
        features = "src/test/resources/features",
        glue = {"generalstore/stepdefs", "generalstore/hooks"},
        tags = "",
        dryRun = false,
        monochrome = true
)
public class Runner {

}
