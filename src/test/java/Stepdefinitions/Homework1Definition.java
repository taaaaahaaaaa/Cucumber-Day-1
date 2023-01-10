package Stepdefinitions;

import Pages.GoogleSearchPage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Homework1Definition {
    @Given("Kullanici google'a gider")
    public void kullaniciGoogleAGider() {
        Driver.getDriver().get("https://www.google.com ");
    }

    @When("Cucumber'ı aratir")
    public void cucumberIAratir() {
        GoogleSearchPage hw = new GoogleSearchPage(Driver.getDriver());

        hw.searchFor("Cucumber");
    }

    @Then("Title'da cucumber yazildigini dogrular")
    public void titleDaCucumberYazildiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Cucumber"));
        Driver.closeDriver();
    }
}
