package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features={".//features/login.feature"}, glue="stepDefinations")
public class testrun {

}
