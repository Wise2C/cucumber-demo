package com.wise2c.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:build/cucumber.html"},
        tags = {"@one"},
        features = {"src/test/resources/scenarios/wise2c"}
)
public class MainTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainTest.class);


}
