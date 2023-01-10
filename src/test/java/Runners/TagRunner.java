package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


//Sadece @smoke tagine sahip olan senaryoları çalıştıran runner
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"Stepdefinitions"},
        tags = "@smoke",
        dryRun = false
)

    /*

    "@tag" -> @tag ile etiketlenen senaryolar
    "@tag1 and not @tag2" -> @tag1 ile etiketlenen senaryolar, @tag2 ile etkilenmeyen senaryolar
    "@tag1 and @tag2" -> Her ikisi ile etiketlenen senaryolar @tag1 ve @tag2
    "@tag1 or @tag2" -> @tag1 ya da @tag2 ile etiketlenen senaryolar

    */
public class TagRunner {
}
