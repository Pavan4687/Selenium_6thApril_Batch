package com.test_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Feature",
glue={"step_definition"},
junit = "--step-notifications"
//tags = {"@PaymentPass"}
)

public class Test_Runner {

}
