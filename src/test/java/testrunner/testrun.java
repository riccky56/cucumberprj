package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features={".//features/login2.feature"}, 
				features={".//features/login.feature"}, 
		glue="stepDefinations",
		
		plugin= {"pretty", "html:reports/myreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
		},
				//tags="@smoke",
		
		publish=true

		
		)
// Class declaration that groups the related example logic in one place.
public class testrun {

}
