package Runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="Features",
glue="StepDefinitions",
plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//plugin={"pretty","json:target/cucumberReports.json"}
//plugin={"pretty","junit:target/cucumberReports.xml"})
)
public class TestNGRunner  extends AbstractTestNGCucumberTests{
	
 
}
