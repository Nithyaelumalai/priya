package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Feature\\LoginPage.feature", glue = "com.steps")
public class TestRunner extends AbstractTestNGCucumberTests {

}
