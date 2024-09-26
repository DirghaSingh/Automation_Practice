package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
        features = "classpath:features",
		glue = "steps",
		publish = true,
 		tags = "@TestCase6"
		)

public class RunnerWeb extends AbstractTestNGCucumberTests{

	
}   

