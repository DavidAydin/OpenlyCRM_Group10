package com.openlyCRM.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/openlyCRM/step_definitions",
        plugin = "html:target/failed-html-report"
        
)

public class FailedTestRunner {
}
