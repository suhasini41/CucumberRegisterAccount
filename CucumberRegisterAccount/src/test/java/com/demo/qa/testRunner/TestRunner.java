package com.demo.qa.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/com/demo/qa/features/Registration.feature"},
		glue = {"register/stepDefinitions"},
		monochrome = true,
		strict = true,
		dryRun = false
				
		)
public class TestRunner {

}
