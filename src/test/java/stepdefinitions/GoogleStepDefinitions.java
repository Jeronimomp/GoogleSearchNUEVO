package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import tasks.Search;
import utils.HisDriver;

import java.sql.SQLOutput;

public class GoogleStepDefinitions {
    Actor angel=null;
    @Before
    public void setUP(){
        angel =Actor.named("Searcher");
        angel.can(BrowseTheWeb.with(HisDriver.chromeDriver()));
    }

    @Given("that i am in the home page of Google")
    public void thatIAmInTheHomePageOfGoogle() {

        angel.wasAbleTo(Open.url("https://www.google.com/"));
    }
    @When("i search the word {string}")
    public void iSearchTheWord(String string) {
        angel.attemptsTo(Search.inGoogle());

    }
    @Then("i see the search in the list")
    public void iSeeTheSearchInTheList() {

    }
}
