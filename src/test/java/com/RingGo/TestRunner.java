package com.RingGo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", format = {"json:target/Destination/cucumber.json"})
public class TestRunner {
}
