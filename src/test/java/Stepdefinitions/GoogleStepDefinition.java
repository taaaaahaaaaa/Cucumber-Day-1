package Stepdefinitions;

import Pages.GoogleSearchPage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinition {
    @Given("Kullanıcı google sayfasındadır")
    public void kullanıcıGoogleSayfasındadır() {
        Driver.getDriver().get("https://www.google.com ");
    }

    @When("Kullanıcı samsung kelşimesini arar")
    public void kullanıcıSamsungKelşimesiniArar() {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());

        sp.searchFor("samsung");
    }

    @Then("Kullanıcı sayfada samsung kelimesi geçtiğini doğrular")
    public void kullanıcıSayfadaSamsungKelimesiGeçtiğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));

        Driver.closeDriver();
    }
}
