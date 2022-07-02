package runnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\fazer\\.eclipse\\maven\\src\\test\\resources\\features",
glue="orange_selDef", monochrome = true, publish = true, dryRun = true)
public class RunnerClass {
	
}