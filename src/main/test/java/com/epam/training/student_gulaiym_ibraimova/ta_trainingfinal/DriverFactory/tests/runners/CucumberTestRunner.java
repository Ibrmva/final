package com.epam.training.student_gulaiym_ibraimova.ta_trainingfinal.DriverFactory.tests.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.epam.training.student_gulaiym_ibraimova.ta_trainingfinal.DriverFactory.tests.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class CucumberTestRunner {
}
