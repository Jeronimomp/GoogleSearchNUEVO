package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/SearchGoogle.feature",
                glue = "stepdefinitions",
                snippets = CucumberOptions.SnippetType.CAMELCASE,
                publish = false)

public class GoogleRunner {
}
