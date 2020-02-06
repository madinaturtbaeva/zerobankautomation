package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "com/zerobank/stepdefinitions",
            dryRun = true,
            tags = "@find_transactions",
            plugin = {"html:target/default-cucumber-reports",
                    "json:target/cucumber.json",
                    "rerun:target/rerun.txt"
            }
    )
    public class Runner {
}
