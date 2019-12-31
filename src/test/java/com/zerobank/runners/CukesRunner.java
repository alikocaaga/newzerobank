package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/zerobank/resources/features",
        glue = "com/zerobank/step_definitions",
        dryRun = false,
        tags = "@smoke_test",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)
        public class CukesRunner{

}
