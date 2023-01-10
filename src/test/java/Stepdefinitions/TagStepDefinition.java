package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagStepDefinition {
    @Given("Smoke test için hazırlıklar yapıldı")
    public void smokeTestIçinHazırlıklarYapıldı() {
    }

    @When("Smoke test çalıştığında")
    public void smokeTestÇalıştığında() {
        System.out.println("Smoke test çalıştı");
    }

    @Then("Smoke test başarılı olmalı")
    public void smokeTestBaşarılıOlmalı() {
    }

    @Given("Regression test için hazırlıklar yapıldı")
    public void regressionTestIçinHazırlıklarYapıldı() {
    }

    @When("Regression test çalıştığında")
    public void regressionTestÇalıştığında() {
        System.out.println("Regression test çalıştı");
    }

    @Then("Regression test başarılı olmalı")
    public void regressionTestBaşarılıOlmalı() {
    }
}
