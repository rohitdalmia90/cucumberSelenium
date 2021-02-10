package com.mycompany.steps;

import com.mycompany.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    private HomePage homePage;

    @Given("that I have gone to the Google page")
    public void that_i_have_gone_to_the_google_page() {
        homePage.openUrl("https://www.google.com/");
    }

    @When("I add {string} to the search box")
    public void i_add_to_the_search_box(String string) {
        homePage.enterSearchInput(string);
    }

    @When("click the Search Button")
    public void click_the_search_button() {
        homePage.clickSearchButton();
    }


}
