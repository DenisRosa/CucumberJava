package Test;


import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Feature/login.feature",
glue = { "" }, monochrome = true, dryRun = false)
@Test
public class EmailTestNG extends AbstractTestNGCucumberTests{

}
