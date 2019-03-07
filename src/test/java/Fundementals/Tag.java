package Fundementals;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //=>this will run cucumber with Junit.
@CucumberOptions(features = "Features",
        glue="TestSteps",
        dryRun = false,
        //plugin = "html:ReportCucumber",
        tags ="@tag")
//tags=> when we use tag we only indicate file name. it will run only the scenarios which has same tag name
public class Tag {

}
