package com.odoo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/odoo/stepDefinitions",
        //dryRun = false,
     //   tags = "",
        plugin = {"html:target/default-cucumber-reports"}
)
public class CucumberRunner {
}
