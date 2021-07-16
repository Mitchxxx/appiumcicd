package com.qa.runners;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.ServerManager;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.*;
// https://github.com/cucumber/cucumber-jvm/tree/main/examples/calculator-java-testng

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests but still executes each scenario as a separate
 * TestNG test.
 */
@CucumberOptions(
        plugin = {"pretty"
        , "html:target/SamsungS9/cucumber"
        , "summary"
       // , "de.monochromata.cucumber.report.PrettyReports:target/SamsungS9/cucumber-html-reports"
        }
        ,features = {"src/test/resources"}
        ,glue = {"com.qa.stepdef"}
        ,dryRun=false
        ,monochrome = true
        ,strict = true
        ,tags = {"@LoginPage"}
    )

public class MySamsungS9TestNGRunnerTest extends RunnerBase{


}