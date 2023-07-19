package com.CRM_Archer_B29.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@wip",
        dryRun = true,
        features = "src/test/resources/features",
        glue = "com/CRM_Archer_B29/step_definitions",
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json",
                //"pretty"
        },
        publish = true, // generates a report with public link
        monochrome = false
)
public class CukesRunner {}
