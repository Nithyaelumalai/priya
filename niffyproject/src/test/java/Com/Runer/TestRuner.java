package Com.Runer;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRuner {

@CucumberOptions(features = "src\\test\\resources\\Feature\\LoginPage.feature", glue = "Com.Steps", dryRun=true)
public class TestRunner extends AbstractTestNGCucumberTests {

}

}
