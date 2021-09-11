package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",
		glue={"StepDef","Hooks"}
		
		)

public class Runner extends AbstractTestNGCucumberTests{

}
