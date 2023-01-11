package Stepdefinitions;

import Pages.GoogleSearchPage;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ParameterizedStepsDefinitions {
    @When("Kullanıcı {string} arattığında")
    public void kullanıcıArattığında(String key) {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);
    }

    @Then("Kullanıcı title'da {string} görmelidir")
    public void kullanıcıTitleDaGörmelidir(String key) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));
        Driver.closeDriver();
    }
}
