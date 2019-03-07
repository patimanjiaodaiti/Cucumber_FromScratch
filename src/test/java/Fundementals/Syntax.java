package Fundementals;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //=>this will run cucumber with Junit.
@CucumberOptions(features = "Features/Syntax.feature",
        glue = "TestSteps",
        dryRun = false,
        plugin = "html:ReportCucumber")
//ctrl+alt+l  ==>organize the code
//@CucumberOptions=>it indicates what we need to run in cucumber
//glue=>it indicates where Scenario steps are to glue it with this page. It directly goes to java package
//dryRun=> if we make it true it will implements(creates step definition) new created test case only.
//         if we make it false it will execute the testcase first then feature files
//plugin=> will create a folder where we locate to then generate report files like html, js, css.
//tags=> when we use tag we only indicate file name. it will run only the scenarios which has same tag name

public class Syntax {

}
