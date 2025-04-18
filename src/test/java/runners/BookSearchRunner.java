package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features = ".//src//test//resources//features//BookSearch.feature", //running the particular feature file
		features = ".//src//test//resources//features//", //running all the feature files in folder
		glue =  {"stepDefs"},
		monochrome = true, //readable console output
		dryRun = false,
		plugin = {"pretty",
				"html:target/Reports/HtmlReport.html",
//				"usage:target/Reports/UsageReport",
//				"json:target/Reports/JsonReport.json",
//				"rerun:target/failedScenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			},
		tags = "@SmokeTest"	
		)

public class BookSearchRunner extends AbstractTestNGCucumberTests{
	
	//Parallel execution
	@DataProvider(parallel = true)
	public Object[][] scenarios(){ //inbuilt method
		return super.scenarios();
	}

}

//pretty - verbose console output
//dryRun - check weather all the steps implementation done or not before the actual run of the test.
//if dryRun is true then the console displays which step is missing if any code commented or missed
//dryRun = false then the runner will execute the steps
//dryRun default will be false