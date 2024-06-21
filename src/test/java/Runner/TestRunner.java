package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\anush\\eclipse-workspace\\Cucumber_Screenshot_FrameworkProject\\src\\test\\java\\Resources\\search.feature",
    glue = "StepDefinations",
    plugin = {"pretty","html:target/cucumber-html-report.html",
              "json:target/cucumber.json", "rerun:target/rerun.txt"},
    monochrome = true
)
public class TestRunner {
}



