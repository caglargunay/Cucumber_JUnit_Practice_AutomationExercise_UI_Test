package caglar.runnner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(

        plugin = "html:target/cucumber-cucumber-report.html" ,

        features = "src/test/resources/features_caglar",

        glue = "caglar/step_definitions",

        dryRun = false,

        tags = "@yunus"

)
public class CukesRunner {




}
