package com.virgingames.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features" ,                                                 //features pack under resources
        glue     = "com/virgingames/steps" ,                                                      //steps under test
        plugin = {"html:target/cucumber-reports/cucumber.html" ,                                //default report
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},                                //from info.txt, extent report
        tags = "@Smoke"
)                                                                                          //for test output folder

public class RunCukeTest extends AbstractTestNGCucumberTests
{

}
