package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					dryRun = false, 
					features= {"src/test/java/features"},
					glue= {"stepdefs","hooks"},
					monochrome = true,
					tags = "@smoke and not @Babu"
				
				)
public class RunCucumberTests extends AbstractTestNGCucumberTests{

}
