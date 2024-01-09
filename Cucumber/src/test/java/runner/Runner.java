package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "featureFiles" ,
glue={"stepdefinitions"},
plugin= {"html:target/report.html","json:target/report.json"},
monochrome=true,
dryRun = false,
tags = "@background")
public class Runner extends AbstractTestNGCucumberTests{	
}