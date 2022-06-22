package com.flipkart.stepdefintion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//resources//Features",
                  glue="com.flipkart.stepdefintion",
                  plugin="html:target",
                  monochrome=true,
                  dryRun=false,
                  tags="@sanity")




public class TestRunner {

}
