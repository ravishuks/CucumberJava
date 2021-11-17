package Execution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",glue= {"Execution"},
monochrome = true,
//plugin={"pretty","html:target/HtmlReports/"}
//plugin={"pretty","json:target/JsonReports/report.json"}
plugin={"pretty","junit:target/JunitReports/report.xml"},
tags="@smoketest"
		)
public class TestRunner {

}
