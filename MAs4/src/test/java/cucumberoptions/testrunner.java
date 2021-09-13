package cucumberoptions;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
			glue="stepDefinations")
public class testrunner {

}*/

@CucumberOptions(features="src/test/java/features",
glue="stepDefinations")
public class testrunner extends AbstractTestNGCucumberTests{

}