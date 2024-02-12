package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepDefinitions"},
        // tags = "@Activity1",
        //tags="@activity2",
        //tags="@activity3',
        //tags="@activity4",
        //tags="@activity5",
        plugin={"pretty"},
        monochrome = true
)
public class Runner {

}
