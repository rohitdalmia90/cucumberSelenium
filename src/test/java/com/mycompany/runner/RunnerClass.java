package com.mycompany.runner;

import io.cucumber.junit.CucumberOptions;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Cucumber Runner Class
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},tags={"@Search"},features ="src/test/resources/features", glue = "com.mycompany.steps")
public class RunnerClass {
}

// In this class we can add test setup and tear down if necessary
