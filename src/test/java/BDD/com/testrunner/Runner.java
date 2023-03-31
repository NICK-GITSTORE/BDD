package BDD.com.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( 
features = "src\\test\\java\\BDD\\com\\feature", 
glue ={"BDD.com.backend" , "BDD.com.Hooks"},
stepNotifications = true,
tags="@TC-3" ,
plugin = {"pretty","html:target\\Report\\FbReport.html",
		"json:target\\Report\\FbReport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
 monochrome = true, dryRun= false , publish=true
)
public class Runner {
	

}


