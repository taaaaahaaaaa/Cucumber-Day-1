package Stepdefinitions;

import io.cucumber.java.en.*;

public class FirstStepDefinition {
    @Given("Ilk feature için cucumber indirdim")
    public void ılk_feature_için_cucumber_indirdim() {
        System.out.println("Given stepi çalıştı");
    }
    @When("Seneryomu calıştırdığımda")
    public void seneryomu_calıştırdığımda() {
        System.out.println("When stepi çalıştı");
    }
    @Then("Seneryomun calıştığını konsolda görmeliyim")
    public void seneryomun_calıştığını_konsolda_görmeliyim() {
        System.out.println("Then stepi çalıştı");
    }
}
