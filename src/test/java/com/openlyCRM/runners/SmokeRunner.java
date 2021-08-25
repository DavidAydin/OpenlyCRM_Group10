package com.openlyCRM.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"
        },
        strict = true,
        features = "src/test/resources/features/smoke.feature",
        glue = "com/openlyCRM/step_definitions"
        
)

public class SmokeRunner {


}