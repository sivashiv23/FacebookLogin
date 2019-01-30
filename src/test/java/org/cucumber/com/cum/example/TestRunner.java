package org.cucumber.com.cum.example;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/Login.feature", glue = { "org.cucumber.com.cum.example" }, plugin = {
		"json:/com.cum.example/target/jsonReport.json", "html:target" })
public class TestRunner {

}
