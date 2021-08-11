package org.test.spacex.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true, 
		features = "src/test/resources/features", 
		tags = "@Functional", 
		dryRun = false,
		snippets = CucumberOptions.SnippetType.CAMELCASE,
		glue = {"org.test.sample.stepDefs","" }, 
		plugin = { "pretty", "json:target/cucumber-report.json","junit:target/cucumber-report.xml"})

public class CucumberRunnerTest {

}
