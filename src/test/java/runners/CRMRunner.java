package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//src//test//resources//taggedFeatures//",
		glue =  {"stepDefs"},
		monochrome = true,
//		tags = "@SmokeTest"
//		tags = "@RegressionTest"
//		tags = "@SmokeTest and @RegressionTest"
//		tags = "@SmokeTest or @RegressionTest" 
//		tags = "not @SmokeTest and not @RegressionTest"//selected scenarios
//		tags = "not @PhaseOne and not @PhaseTwo" //feature level tags to run selected feature
//		tags = "@PhaseOne and @SmokeTest" //Run selected feature and selected scenario
//		tags = "@PhaseOne and @SmokeTest or @PhaseOne and @RegressionTest"
//		tags = "@PhaseOne and @SmokeTest or @PhaseTwo and @SmokeTest"
//		tags = "@PhaseOne and not @SmokeTest or @PhaseTwo and not @SmokeTest"
//		tags = "@PhaseOne and @SmokeTest or @PhaseOne and @RegressionTest or @PhaseTwo and @SmokeTest or @PhaseTwo and @RegressionTest"
		tags = "@PhaseThree"
		)

public class CRMRunner extends AbstractTestNGCucumberTests{
	

}

