package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//features/login.feature"}, 
		glue="stepDefinations",
		
		plugin= {"pretty", "html:reports/myreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
		},
				//tags="@smoke",
		
		publish=true

		
		)
public class testrun {

}
