package pom_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Feature\\Login.feature"}, glue = {"stepDefinition"},
plugin = {"html:TestOutputReport/testoutput.html", "junit:TestOutputReport/junit_xml/cucumber.xml", "json:TestOutputReport/json_output/cucumber.json"}
		)
public class Test_runner {

}
