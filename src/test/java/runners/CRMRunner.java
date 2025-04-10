package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//src//test//resources//taggedFeatures//",
		glue =  {"stepDefs"},
		monochrome = true,
//		tags = "@SmokeTest"
//		tags = "@RegressionTest"
//		tags = "@SmokeTest" and "@RegressionTest" //no scenario with both tags so no result
		tags = "@SmokeTest and @RegressionTest"
//		tags = "@SmokeTest or @RegressionTest"
		)

public class CRMRunner extends AbstractTestNGCucumberTests{
	

}
