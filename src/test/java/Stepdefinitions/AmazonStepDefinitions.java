package Stepdefinitions;

import Pages.AmazonHomePage;
import Pages.AmazonSearchPage;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDefinitions {
    @Given("Kullanıcı amazon sitesine gider")
    public void kullanıcıAmazonSitesineGider() {
        Driver.getDriver().get("https://www.amazon.com.tr");
    }

    @When("Kullanıcı amazonda {string} aratır")
    public void kullanıcıAmazondaAratır(String key) {
        AmazonHomePage hp = new AmazonHomePage(Driver.getDriver());
        hp.searchKeyHitEnter(key);
    }

    @Then("Kullanıcı arama sonuçlarında {string} görmelidir")
    public void kullanıcıAramaSonuçlarındaGörmelidir(String key) {
        AmazonSearchPage sp = new AmazonSearchPage(Driver.getDriver());
        sp.validateResultTextHasKey(key);
    }

    @And("Kullanıcı Ekran görüntüsü alır")
    public void kullanıcıEkranGörüntüsüAlır() {
        System.out.println("Ekran goruntusu alinir");
    }

    @And("Kullanıcı browser'ı kapatır")
    public void kullanıcıBrowserIKapatır() {
        Driver.closeDriver();
    }
}
